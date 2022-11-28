package com.bhavna.model;

public class Area extends State{
    private String locality;
    private int zipCode;

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public Area(String countryName, String stateName, String locality, int zipCode) {
        super(countryName, stateName);
        this.locality = locality;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +"Country='" + getCountryName() + '\'' +"State='" + getStateName() + '\'' +
                "locality='" + locality + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
