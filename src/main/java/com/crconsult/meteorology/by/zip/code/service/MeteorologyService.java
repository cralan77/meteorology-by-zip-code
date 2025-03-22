package com.crconsult.meteorology.by.zip.code.service;

import com.crconsult.meteorology.by.zip.code.model.entity.Meteorology;
import com.crconsult.meteorology.by.zip.code.model.entity.ZipCode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="weather", url="https://api.hgbrasil.com")
public interface MeteorologyService {

    @GetMapping(
                    "weather?array_limit={arrayLimit}&fields=only_results&key=0a6b31a9&city_name={cityName}"
    )
    Meteorology meteorology(
             @PathVariable("cityName") String filterParam,
             @PathVariable("arrayLimit") String arrayLimit
            );


}
