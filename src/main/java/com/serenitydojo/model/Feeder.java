package com.serenitydojo.model;

import static com.serenitydojo.model.FoodType.CABBAGE;
import static com.serenitydojo.model.FoodType.DELUXE_FOOD;
import static com.serenitydojo.model.FoodType.DOG_FOOD;
import static com.serenitydojo.model.FoodType.LETTUCE;
import static com.serenitydojo.model.FoodType.SALMON;
import static com.serenitydojo.model.FoodType.TUNA;
import static com.serenitydojo.model.FoodType.UNKNOWN;

public class Feeder {

    public static FoodType feeds(AnimalType animal, boolean isPremium) {

        switch (animal) {
            case CAT:
                return (isPremium) ? SALMON : TUNA;
            case DOG:
                return (isPremium) ? DELUXE_FOOD : DOG_FOOD;
            case HAMPSTER:
                return (isPremium) ? LETTUCE : CABBAGE;
            default:
                return UNKNOWN;
        }

        // if (animal.equals("Cat")) {
        // return (isPremium) ? "Salmon" : "Tuna";
        // }

        // if (animal.equals("Dog")) {
        // return (isPremium) ? "Deluxe Food" : "Dog Food";
        // }

        // if (animal.equals("Hamster")) {
        // return (isPremium) ? "Lettuce" : "Cabbage";
        // }

    }
}
