package com.crconsult.meteorology.by.zip.code.model.repository;

import com.crconsult.meteorology.by.zip.code.model.entity.Meteorology;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeteorologyRepository extends CrudRepository<Meteorology, Long> {
}
