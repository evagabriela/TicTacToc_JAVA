import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by gzamudio on 5/1/14.
 */
public class Game {
    private PrintStream printStream;
    private BufferedReader reader;
    private Grid grid;

    public Game(PrintStream printStream, BufferedReader reader){
        this.printStream = printStream;
        this.reader = reader;
    }

    public void start()throws IOException {
        printStream.println("Welcome to Tic Tac Toc");
        String emptyBoard= " | | \n"
                + "-----\n"
                + " | | \n"
                + "-----\n"
                + " | | \n" ;
        printStream.println(emptyBoard);
        printStream.println("Please enter a number between 1 and 9");
    }

    public void positionTakenMessage() {
        printStream.println("Location already taken");
    }

    public void fullGridMessage(){
        printStream.println("Game is a draw");
    }
}
