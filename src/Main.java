import Game.Game;

import java.io.IOException;
import java.io.PrintStream;

public class Main {



    public static void main(String[] args) throws IOException {
       PrintStream out = System.out;

       Grid grid = new Grid();
       grid.print();
       Game game = new Game(out);
       game.start();
    }
}
