package com.bantolomeus.decorator;

public class Balcony extends Upgrade {
    private House house;
    private Integer cost = 5000;

    public Balcony(House house){
        this.house = house;
    }

    public Integer getCost() {
        return house.getCost() + cost;
    }
}
