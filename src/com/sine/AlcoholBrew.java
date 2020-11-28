package com.sine;

public class AlcoholBrew extends BaseBrew {
    // value-added-tax
    double vat;

    public AlcoholBrew(String name, double basePrice, double volume) {
        super(name, basePrice,volume);

        // default vat
        this.vat = 1.25;
    }

    public AlcoholBrew(String name, double basePrice, double volume, double vat) {
        super(name, basePrice, volume);

        this.vat = vat;
    }

    @Override
    protected double getVolume() {
        return this.volume;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double countPrice() {
        return this.basePrice * this.volume * this.vat;
    }

    @Override
    public String getComposition() {
        return String.format("%s <taken that %.3f multiplier included>", super.getComposition(), this.vat);
    }
}
