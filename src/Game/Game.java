package Game;

import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by gzamudio on 5/1/14.
 */
public class Game {
    private PrintStream printStream;

    public Game(PrintStream printStream){
        this.printStream = printStream;
    }

    public void start()throws IOException {
        printStream.println("Please enter a number between 1 and 9");
    }
}
