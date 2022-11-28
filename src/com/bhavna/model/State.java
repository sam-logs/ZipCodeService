package com.bhavna.model;

public class State extends Country{
    private String stateName;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public State(String countryName, String stateName) {
        super(countryName);
        this.stateName = stateName;
    }
}
