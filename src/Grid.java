import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by gzamudio on 5/1/14.
 */
public class Grid {

    private final PrintStream printStream;
    private final BufferedReader reader;
    private ArrayList<String> positions;


    public Grid(PrintStream printStream, ArrayList<String> positions, BufferedReader reader) {
        this.printStream = printStream;
        this.positions = positions;
        this.reader = reader;
    }



    public void draw() {
        String Board = positions.get(0) + "|" + positions.get(1) + "|" + positions.get(2) + "\n"
                     + "-----" + "\n"
                     + positions.get(3) + "|" + positions.get(4) + "|" + positions.get(5) + "\n"
                     + "-----" + "\n"
                     + positions.get(6) + "|" + positions.get(7) + "|" + positions.get(8) + "\n";

        printStream.println(Board);
    }

    public void drawWithInput(int positionMarker,String marker) {
        positions.set(positionMarker - 1, marker);
    }


    public boolean isPositionTaken(int position) {
            return !(positions.get(position - 1).equals(" "));

    }

    public boolean isFull() {
        return (!positions.contains(" "));
    }


    public void displayFinalGrid() {

    }
}
