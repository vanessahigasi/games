package tech.bts.games;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    Game g1 = new Game("Chess",2,20);
    Game g2 = new Game("Domino",2,10);
    Game g3 = new Game("Parchis",4,15);

    List<Game> games = new ArrayList<Game>();

    games.add(g1);
    games.add(g2);
    games.add(g3);

    for (Game game : games) {
        System.out.println(game.getName() + ", " + game.getNumPlayers() + " players"
        + ", " + game.getPrice() + " € ");
    }



    }
}
