package tech.bts.games;

public class Game {

    //fields
    private String name;
    private int numPlayers;
    private double price;

    //constructor
    public Game(String name, int numPlayers, double price) {
        this.name = name;
        this.numPlayers = numPlayers;
        this.price = price;
    }

    //getters

    public String getName() {
        return name;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public double getPrice() {
        return price;
    }
}
