import Game.Game;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class GameTest {


    private PrintStream out;
    private Game game;
    private Grid grid;
    private ArrayList<String> positions;
    private PrintStream printStream;

    @Before
    public void setUp() throws Exception {
        out = mock(PrintStream.class);
        game = new Game(out, positions);
        positions= new ArrayList<String>(Arrays.asList(" ", " ", " ", " ", " ", " ", " ", " ", " "));
        grid = new Grid(printStream, positions);

    }

    @Test
    public void shouldPromptPlayerToMakeAMove() throws IOException {
        game.start();
        verify(out).println("Please enter a number between 1 and 9");
    }

    @Test
    public void shouldReturnAMessageIfLocationAlreadyTaken(){
        int location = 1;
        String marker="X";
        grid.drawWithInput(location, marker);
        grid.isPositionTaken(1);
        game.positionTakenMessage();

        verify(out).println("Location already taken");
    }




}