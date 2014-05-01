import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by gzamudio on 5/1/14.
 */
public class Grid {
    private final String lines= "-----";

    private final PrintStream printStream;
    private ArrayList<String> positions;


    public Grid(PrintStream printStream, ArrayList<String> positions) {
        this.printStream = printStream;
        this.positions = positions;
    }



    public void draw() {
        String Board = positions.get(0) + "|" + positions.get(1) + "|" + positions.get(2) + "\n"
                + lines + "\n"
                + positions.get(3) + "|" + positions.get(4) + "|" + positions.get(5) + "\n"
                + lines + "\n"
                + positions.get(6) + "|" + positions.get(7) + "|" + positions.get(8) + "\n";

        printStream.println(Board);
    }

    public void drawWithInput(int positionMarker,String marker) {
        positions.set(positionMarker - 1, marker);
    }


    public boolean isPositionTaken(int position) {
            return !(positions.get(position - 1).equals(" "));
    }


}
