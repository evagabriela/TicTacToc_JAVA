import Game.Game;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Main {


    private static ArrayList<String> positions;
    private static PrintStream printStream;

    public static void main(String[] args) throws IOException {
       PrintStream out = System.out;
       Grid grid = new Grid(printStream, positions);
       grid.draw();
       Game game = new Game(out, positions);
       game.start();
    }

}
