package com.company;


public abstract class Cat {
    private String name;
    private String color;
    private int weightInGrams;
    private boolean isNeutered;
    private String species;

    public Cat(String name, String color, int weightInGrams, boolean isNeutered, String species) {
        this.name = name;
        this.color = color;
        this.weightInGrams = weightInGrams;
        this.isNeutered = isNeutered;
        this.species = species;
    }

    public void displayWeightInPounds() {
        //16 oz in pound
        //28 grams in oz
        int ounces = weightInGrams / 28;
        int pounds = ounces / 16;

        System.out.println(pounds);
    }

    public void neuterPet() {
        isNeutered = true;

    }

    public abstract void meow();

}
