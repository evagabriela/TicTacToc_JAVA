import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by gzamudio on 5/1/14.
 */
public class Game {
    private PrintStream printStream;
    private ArrayList<String> positions;

    public Game(PrintStream printStream, ArrayList<String> positions){
        this.printStream = printStream;
    }

    public void start()throws IOException {
        printStream.println("Please enter a number between 1 and 9");
    }


    public void positionTakenMessage() {
        printStream.println("Location already taken");
    }
}
