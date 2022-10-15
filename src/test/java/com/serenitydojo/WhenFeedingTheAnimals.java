package com.serenitydojo;

import com.serenitydojo.model.Feeder;

import java.beans.Transient;

import org.junit.Assert;
import org.junit.Test;

public class WhenFeedingTheAnimals {

    private Feeder feeder = new Feeder();

    @Test
    public void shouldFeedCatsTuna() {
        String food = feeder.feeds("Cat", false);

        Assert.assertEquals("Tuna", food);
    }

    @Test
    public void shouldFeedHamstersCabbage() {
        String food = feeder.feeds("Hamster", false);

        Assert.assertEquals("Cabbage", food);
    }

    @Test
    public void shouldFeedDogsDogFood() {
        String food = feeder.feeds("Dog", false);

        Assert.assertEquals("Dog Food", food);
    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        String food = feeder.feeds("Cat", true);

        Assert.assertEquals("Salmon", food);

    }

    @Test
    public void shouldFeedPremiumDogsDeluxeFood() {
        String food = feeder.feeds("Dog", true);
        Assert.assertEquals(food, "Deluxe Food");
    }

    @Test
    public void shouldFeedPremiumHampstersLettuce() {
        String food = feeder.feeds("Hamster", true);
        Assert.assertEquals(food, "Lettuce");
    }
}
