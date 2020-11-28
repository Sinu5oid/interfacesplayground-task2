package com.sine;

import java.util.ArrayList;

public class Main {
    // too lazy to even check for exceptions, sorry :C
    public static void main(String[] args) throws NotEnoughComponentsException {
        BaseBrew appleJuice = new BaseBrew("apple juice", 1.25, 200);
        BaseBrew mineralWater = new BaseBrew("mineral water", 0.5, 500);
        AlcoholBrew vodka = new AlcoholBrew("vodka", 2.25, 500, 2.5);
        AlcoholBrew champaigne = new AlcoholBrew("champaigne", 2.25, 1);

	    ArrayList<AbstractBrew> screwdriverComponents = new ArrayList<>();
        screwdriverComponents.add(new AlcoholBrew("vodka", 2.25, 20, 2.5));
        screwdriverComponents.add(new BaseBrew("apple juice", 1.25, 30));

        ComplexBrew screwdriver = new ComplexBrew("screwdriver", screwdriverComponents);

        ArrayList<AbstractBrew> coldBrewComponents = new ArrayList<>();
        coldBrewComponents.add(new BaseBrew("apple juice", 1.25, 50));
        coldBrewComponents.add(new BaseBrew("cold water", 0.01, 200));

        ComplexBrew coldBrew = new ComplexBrew("cold brew", coldBrewComponents);

        ArrayList<AbstractBrew> brews = new ArrayList<>();
        brews.add(appleJuice);
        brews.add(mineralWater);
        brews.add(vodka);
        brews.add(champaigne);
        brews.add(screwdriver);
        brews.add(coldBrew);

        for (AbstractBrew brew: brews) {
            System.out.printf("%s | %s\n%s\n\n", brew.name, brew.countPrice(), brew.getComposition());
        }
    }
}
