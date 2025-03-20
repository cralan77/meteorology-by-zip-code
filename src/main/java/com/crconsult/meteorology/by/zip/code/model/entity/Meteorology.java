package com.crconsult.meteorology.by.zip.code.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "METEOROLOGY")
public class Meteorology {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int temp;
    private String date;
    private String time;
    private String description;
    private String currently;
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, String> forecast = new HashMap<String, String>();


    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCurrently() {
        return currently;
    }

    public void setCurrently(String currently) {
        this.currently = currently;
    }

    public Map<String, String> getForecast() {
        return forecast;
    }

    public void setForecast(Map<String, String> forecast) {
        this.forecast = forecast;
    }
}
