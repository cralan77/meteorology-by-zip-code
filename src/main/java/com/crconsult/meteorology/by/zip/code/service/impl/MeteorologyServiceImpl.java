package com.crconsult.meteorology.by.zip.code.service.impl;

import com.crconsult.meteorology.by.zip.code.model.entity.Meteorology;
import com.crconsult.meteorology.by.zip.code.model.entity.ZipCode;
import com.crconsult.meteorology.by.zip.code.model.repository.MeteorologyRepository;
import com.crconsult.meteorology.by.zip.code.service.ConsulMeteorology;
import com.crconsult.meteorology.by.zip.code.service.MeteorologyService;
import com.crconsult.meteorology.by.zip.code.service.ZipCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeteorologyServiceImpl implements  ConsulMeteorology {

    @Autowired
    private MeteorologyService meteorologyService;
    @Autowired
    private MeteorologyRepository meteorologyRepository;

    @Autowired
    private ZipCodeService zipCodeService;




    @Override
    public Meteorology meteorologyByZipCode(ZipCode zipCode) {

        //ArrayLimit determina quantidade de dias em forecast
        int arrayLimit = 5;
        String filterParam = "city_name="+zipCode.getLocalidade()+","+zipCode.getUf()+ "&array_limit="+arrayLimit+"&fields=only_results,temp,date,time,description,currently,forecast,date,max,min,rain_probability,description&key=0a6b31a9";
        String nada="";
        return meteorologyService.meteorology(filterParam);
    }




}
