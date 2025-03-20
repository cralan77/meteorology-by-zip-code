package com.crconsult.meteorology.by.zip.code.service;

import com.crconsult.meteorology.by.zip.code.model.entity.Meteorology;
import com.crconsult.meteorology.by.zip.code.model.entity.ZipCode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="weather", url="https://api.hgbrasil.com")
public interface MeteorologyService {

    @GetMapping(
                    "weather?{filterParam}"
    )
    Meteorology meteorology(
             @PathVariable("filterParam") String filterParam
            );



}
