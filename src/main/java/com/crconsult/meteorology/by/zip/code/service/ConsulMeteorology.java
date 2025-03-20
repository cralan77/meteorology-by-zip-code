package com.crconsult.meteorology.by.zip.code.service;

import com.crconsult.meteorology.by.zip.code.model.entity.Meteorology;
import com.crconsult.meteorology.by.zip.code.model.entity.ZipCode;
import com.crconsult.meteorology.by.zip.code.service.MeteorologyService;

public interface ConsulMeteorology  {


    Meteorology meteorologyByZipCode(ZipCode zipCode);
}
