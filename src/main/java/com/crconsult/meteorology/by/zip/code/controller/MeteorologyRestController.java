package com.crconsult.meteorology.by.zip.code.controller;

import com.crconsult.meteorology.by.zip.code.model.entity.Meteorology;
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
    private ConsulMeteorology consulMeteorology;



    @GetMapping("/{zipCode}")
    public ResponseEntity<Meteorology> consultMeteorologyByZipCode(@PathVariable String zipCode){

        return ResponseEntity.ok(consulMeteorology.meteorologyByZipCode(zipCodeService.consultZipCode(zipCode)));
    }

}
