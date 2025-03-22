package com.crconsult.meteorology.by.zip.code.controller;

import com.crconsult.meteorology.by.zip.code.model.entity.Meteorology;
import com.crconsult.meteorology.by.zip.code.model.entity.ZipCode;
import com.crconsult.meteorology.by.zip.code.model.repository.ForecastRepository;
import com.crconsult.meteorology.by.zip.code.model.repository.MeteorologyRepository;
import com.crconsult.meteorology.by.zip.code.model.repository.ZipCodeRepository;
import com.crconsult.meteorology.by.zip.code.service.ConsulMeteorology;
import com.crconsult.meteorology.by.zip.code.service.ZipCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("meteorologia")
public class MeteorologyRestController {

    @Autowired
    private ZipCodeService zipCodeService;

    @Autowired
    private ZipCodeRepository zipCodeRepository;

    @Autowired
    private MeteorologyRepository meteorologyRepository;

    @Autowired
    private ForecastRepository forecastRepository;

    @Autowired
    private ConsulMeteorology consulMeteorology;



    @GetMapping("/{cep}&{forecast}")
    public ResponseEntity<Meteorology> consultMeteorologyByZipCode(@PathVariable String cep, @PathVariable String forecast){

        ZipCode zipCode = zipCodeService.consultZipCode(cep);
        Meteorology meteorology = consulMeteorology.meteorologyByZipCode(zipCode, forecast);

        zipCodeRepository.save(zipCode);
        forecastRepository.saveAll(meteorology.getForecast());
        meteorologyRepository.save(meteorology);

        return ResponseEntity.ok(meteorology);
    }

}
