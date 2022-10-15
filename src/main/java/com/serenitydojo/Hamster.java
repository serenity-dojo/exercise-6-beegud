package com.serenitydojo;

public class Hamster extends Pet {

    private String favoriteGame;

    public String getFavoriteGame() {
        return favoriteGame;
    }

    public Hamster(String name, String favoriteGame, int age) {
        super(name, age);
        this.favoriteGame = favoriteGame;
    }

    @Override
    public String play() {
        // TODO Auto-generated method stub
        return "runs in wheel";
    }

}
