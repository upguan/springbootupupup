package com.hqyj.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MCity {
    private Integer cityId;

    private String cityName;

    private String localCityName;

    private Integer countryId;

    private String district;

    private Integer population;

 //   @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date dateModified;

    private Date dateCreated;

    public MCity(Integer cityId, String cityName, String localCityName, Integer countryId, String district, Integer population, Date dateModified, Date dateCreated) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.localCityName = localCityName;
        this.countryId = countryId;
        this.district = district;
        this.population = population;
        this.dateModified = dateModified;
        this.dateCreated = dateCreated;
    }

    public MCity() {
        super();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getLocalCityName() {
        return localCityName;
    }

    public void setLocalCityName(String localCityName) {
        this.localCityName = localCityName == null ? null : localCityName.trim();
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

	@Override
	public String toString() {
		return "MCity [cityId=" + cityId + ", cityName=" + cityName + ", localCityName=" + localCityName
				+ ", countryId=" + countryId + ", district=" + district + ", population=" + population
				+ ", dateModified=" + dateModified + ", dateCreated=" + dateCreated + "]";
	}
    
}