import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by gzamudio on 5/1/14.
 */
public class GridTest {

    private PrintStream printStream;
    private Grid grid;
    private ArrayList<String> positions;

    @Before
    public void setUp() {
        printStream= mock(PrintStream.class);
        positions= new ArrayList<String>(Arrays.asList(" ", " ", " ", " ", " ", " ", " ", " ", " "));
        grid= new Grid(printStream, positions);
    }

   @Test
   public void shouldDrawEmptyBoard() {
       String emptyBoard= " | | \n"
                        + "-----\n"
                        + " | | \n"
                        + "-----\n"
                        + " | | \n" ;
       grid.draw();

       verify(printStream).println(emptyBoard);
   }

    @Test
    public void shouldMarkGridWhenPlayerOneMoves(){
        String marker = "X";
        grid.drawWithInput(1,marker);
        assertEquals("X", positions.get(0));
    }

    @Test
    public void shouldMarkGridWhenPlayerTwoMoves(){
        String marker = "O";
        grid.drawWithInput(1, marker);
        assertEquals("O", positions.get(0));
    }

    //    Location already taken
//    If either player moves into a cell that is already used, display the message, “Location already taken”
   // and prompt them to try again (repeat this until they make a valid move).
    @Test
    public void shouldDisplayIfPositionAlreadyTaken(){
        int location=1;
        String marker="X";
        grid.drawWithInput(location, marker);

        assertTrue(grid.isPositionTaken(location));
    }
}