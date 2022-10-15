package com.serenitydojo;

import com.serenitydojo.model.FoodType;

import static com.serenitydojo.model.AnimalType.CAT;
import static com.serenitydojo.model.AnimalType.DOG;
import static com.serenitydojo.model.AnimalType.HAMPSTER;
import static com.serenitydojo.model.Feeder.feeds;
import static com.serenitydojo.model.FoodType.DELUXE_FOOD;
import static com.serenitydojo.model.FoodType.LETTUCE;
import static com.serenitydojo.model.FoodType.DOG_FOOD;
import static com.serenitydojo.model.FoodType.CABBAGE;
import static com.serenitydojo.model.FoodType.TUNA;
import static com.serenitydojo.model.FoodType.SALMON;

import org.junit.Assert;
import org.junit.Test;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna() {
        FoodType food = feeds(CAT, false);

        Assert.assertEquals(TUNA, food);
    }

    @Test
    public void shouldFeedHamstersCabbage() {
        FoodType food = feeds(HAMPSTER, false);

        Assert.assertEquals(CABBAGE, food);
    }

    @Test
    public void shouldFeedDogsDogFood() {
        FoodType food = feeds(DOG, false);

        Assert.assertEquals(DOG_FOOD, food);
    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        FoodType food = feeds(CAT, true);

        Assert.assertEquals(SALMON, food);

    }

    @Test
    public void shouldFeedPremiumDogsDeluxeFood() {
        FoodType food = feeds(DOG, true);
        Assert.assertEquals(food, DELUXE_FOOD);
    }

    @Test
    public void shouldFeedPremiumHampstersLettuce() {
        FoodType food = feeds(HAMPSTER, true);
        Assert.assertEquals(food, LETTUCE);
    }
}
