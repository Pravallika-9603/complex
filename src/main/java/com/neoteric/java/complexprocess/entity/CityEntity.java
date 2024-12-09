package com.neoteric.java.complexprocess.entity;
import jakarta.persistence.*;

@Entity(name = "complex_table")

public class CityEntity {

    @Id

    @Column(name="id",nullable = false)
    private Long id;

    @Column(name="cityname")
    private String cityName;

    @Column(name="countryname",nullable = false)
    private String countryName;

    @Column(name="type",nullable = false)
    private String type;

    @Column(name="fullregionname",nullable = false)
    private String fullRegionName;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFullRegionName() {
        return fullRegionName;
    }

    public void setFullRegionName(String fullRegionName) {
        this.fullRegionName = fullRegionName;
    }

}
