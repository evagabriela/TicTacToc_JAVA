import Game.Game;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Main {


    private static ArrayList<String> positions;

    public static void main(String[] args) throws IOException {
       PrintStream out = System.out;

       Grid grid = new Grid();
       grid.print();
       Game game = new Game(out, positions);
       game.start();
    }
}
