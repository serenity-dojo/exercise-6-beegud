package com.serenitydojo.model;

public class Feeder {

    public String feeds(String animal, boolean isPremium) {

        String food = "Food";
        if (animal.equals("Cat")) {
            food = (isPremium) ? "Salmon" : "Tuna";
        }

        if (animal.equals("Dog")) {
            food = (isPremium) ? "Deluxe Food" : "Dog Food";
        }

        if (animal.equals("Hamster")) {
            food = (isPremium) ? "Lettuce" : "Cabbage";
        }

        return food;

    }
}
