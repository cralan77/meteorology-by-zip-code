package com.crconsult.meteorology.by.zip.code.service;

import com.crconsult.meteorology.by.zip.code.model.entity.Meteorology;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="weather", url="https://api.hgbrasil.com/weather?")
public interface MeteorologyService {

    @GetMapping(
                    "city_name={cityname}&" +
                    "array_limit={arraylimit}&" +
                    "fields=only_results,temp,date,time,description,currently,forecast,date,max,min,rain_probability,description&" +
                    "key=0a6b31a9"
    )
    Meteorology meteorology(
            @PathVariable("cityname") String cityName,
            @PathVariable("arraylimit") String arrayLimit
            );
}
