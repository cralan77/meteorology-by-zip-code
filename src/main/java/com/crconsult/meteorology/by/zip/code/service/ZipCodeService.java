package com.crconsult.meteorology.by.zip.code.service;

import com.crconsult.meteorology.by.zip.code.model.entity.ZipCode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="viacep", url="https://viacep.com.br/ws")
public interface ZipCodeService {

    @GetMapping("/{cep}/json/")
    ZipCode consultZipCode(@PathVariable("cep") String cep);
}
