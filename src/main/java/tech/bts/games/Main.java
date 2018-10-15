package tech.bts.games;

import java.util.ArrayList;
import java.util.Arrays;
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

    int columnWidth = 10;

    List<String> fieldNames = Arrays.asList("Name","Players","Price");

    String title = "";

    for (String fieldName : fieldNames) {
        title += StringUtil.padRight(fieldName,columnWidth);
    }

    String line = StringUtil.repeat("-",columnWidth * fieldNames.size());

    System.out.println(title);
    System.out.println(line);

        for (Game game : games) {
            String gametLine = StringUtil.padRight(game.getName(),columnWidth)
                    + StringUtil.padRight("" + game.getNumPlayers(),columnWidth)
                    + StringUtil.padRight("" + game.getPrice(),columnWidth);

            System.out.println(gametLine);
        }

        System.out.println(line);





    }
}
