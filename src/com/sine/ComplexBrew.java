package com.sine;

import java.util.ArrayList;
import java.util.StringJoiner;

public class ComplexBrew extends AbstractBrew {
    private final ArrayList<AbstractBrew> components;

    public ComplexBrew(String name, ArrayList<AbstractBrew> components) throws NotEnoughComponentsException {
        if (components.size() < 1) {
            throw new NotEnoughComponentsException("components length should be at least 1");
        }

        this.name = name;
        this.components = components;
    }

    @Override
    public double getVolume() {
        double sum = 0;

        for (AbstractBrew component : this.components) {
            sum += component.getVolume();
        }

        return sum;
    }

    @Override
    public double countPrice() {
        double sum = 0;

        for (AbstractBrew component : this.components) {
            sum += component.countPrice();
        }

        return sum;
    }

    @Override
    public String getComposition() {
        StringJoiner joiner = new StringJoiner(", ").setEmptyValue("no components");

        for (AbstractBrew component : this.components) {
            joiner.add(component.getComposition());
        }

        return String.format("%s (%.3f ml) [%.3f USD]: %s", this.name, this.getVolume(), this.countPrice(), joiner.toString());
    }
}
