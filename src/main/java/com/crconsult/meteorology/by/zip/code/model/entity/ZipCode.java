package com.crconsult.meteorology.by.zip.code.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name="ZIPCODE")
public class ZipCode {

    @Id
    private String zipcode;
    private String street;
    private String district;
    private String city;
    private String stete;

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStete() {
        return stete;
    }

    public void setStete(String stete) {
        this.stete = stete;
    }
}
