package com.example.demo2;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder(builderMethodName = "newBuilder")
public class Animal {
    private String race;
    private int weigth;
    private Boolean male;

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public Boolean getMale() {
        return male;
    }

    public void setMale(Boolean male) {
        this.male = male;
    }

    public Animal(){}



}
