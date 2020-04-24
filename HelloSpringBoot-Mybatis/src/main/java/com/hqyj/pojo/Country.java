package com.hqyj.pojo;

import java.util.Date;

public class MCountry {
    private Integer countryId;

    private String countryName;

    private String localCountryName;

    private String countryCode;

    private String countryCode2;

    private String continent;

    private String region;

    private Float surfaceArea;

    private Integer indepYear;

    private Integer population;

    private Float lifeExpectancy;

    private Float gnp;

    private String governmentForm;

    private String headOfState;

    private Integer capital;

    private String timeZone;

    private Integer languageId;

    private Integer currencyId;

    private Date dateModified;

    private Date dateCreated;

    public MCountry(Integer countryId, String countryName, String localCountryName, String countryCode, String countryCode2, String continent, String region, Float surfaceArea, Integer indepYear, Integer population, Float lifeExpectancy, Float gnp, String governmentForm, String headOfState, Integer capital, String timeZone, Integer languageId, Integer currencyId, Date dateModified, Date dateCreated) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.localCountryName = localCountryName;
        this.countryCode = countryCode;
        this.countryCode2 = countryCode2;
        this.continent = continent;
        this.region = region;
        this.surfaceArea = surfaceArea;
        this.indepYear = indepYear;
        this.population = population;
        this.lifeExpectancy = lifeExpectancy;
        this.gnp = gnp;
        this.governmentForm = governmentForm;
        this.headOfState = headOfState;
        this.capital = capital;
        this.timeZone = timeZone;
        this.languageId = languageId;
        this.currencyId = currencyId;
        this.dateModified = dateModified;
        this.dateCreated = dateCreated;
    }

    public MCountry() {
        super();
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
    }

    public String getLocalCountryName() {
        return localCountryName;
    }

    public void setLocalCountryName(String localCountryName) {
        this.localCountryName = localCountryName == null ? null : localCountryName.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getCountryCode2() {
        return countryCode2;
    }

    public void setCountryCode2(String countryCode2) {
        this.countryCode2 = countryCode2 == null ? null : countryCode2.trim();
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent == null ? null : continent.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public Float getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(Float surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public Integer getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(Integer indepYear) {
        this.indepYear = indepYear;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Float getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(Float lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public Float getGnp() {
        return gnp;
    }

    public void setGnp(Float gnp) {
        this.gnp = gnp;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm == null ? null : governmentForm.trim();
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState == null ? null : headOfState.trim();
    }

    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone == null ? null : timeZone.trim();
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
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
		return "MCountry [countryId=" + countryId + ", countryName=" + countryName + ", localCountryName="
				+ localCountryName + ", countryCode=" + countryCode + ", countryCode2=" + countryCode2 + ", continent="
				+ continent + ", region=" + region + ", surfaceArea=" + surfaceArea + ", indepYear=" + indepYear
				+ ", population=" + population + ", lifeExpectancy=" + lifeExpectancy + ", gnp=" + gnp
				+ ", governmentForm=" + governmentForm + ", headOfState=" + headOfState + ", capital=" + capital
				+ ", timeZone=" + timeZone + ", languageId=" + languageId + ", currencyId=" + currencyId
				+ ", dateModified=" + dateModified + ", dateCreated=" + dateCreated + "]";
	}
    
}