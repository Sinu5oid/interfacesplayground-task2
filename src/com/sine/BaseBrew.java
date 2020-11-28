package com.sine;

public class BaseBrew extends AbstractBrew {
    // let's assume we count price in USD
    protected double basePrice;

    // let's assume we count volume in milliliters
    protected final double volume;

    public BaseBrew(String name, double price, double volume) {
        this.name = name;
        this.basePrice = price;
        this.volume = volume;
    }

    @Override
    protected double getVolume() {
        return volume;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double countPrice() {
        return this.basePrice * this.volume;
    }

    @Override
    public String getComposition() {
        return String.format("%s: (%.3f ml) [%.3f USD]", this.name, this.volume, this.countPrice());
    }
}
