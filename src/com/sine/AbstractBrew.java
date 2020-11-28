package com.sine;

public abstract class AbstractBrew {
    protected String name;

    protected abstract double getVolume();

    public abstract double countPrice();

    public abstract String getComposition();
}
