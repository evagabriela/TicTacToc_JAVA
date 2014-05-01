import Game.Game;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class GameTest {


    private PrintStream out;
    private Game game;
    private Grid grid;
    private ArrayList<String> positions;

    @Before
    public void setUp() throws Exception {
        out = mock(PrintStream.class);
        game = new Game(out, positions);
        positions= new ArrayList<String>(Arrays.asList(" ", " ", " ", " ", " ", " ", " ", " ", " "));
        grid = new Grid();

    }

    @Test
    public void shouldPromptPlayerToMakeAMove() throws IOException {
        game.start();
        verify(out).println("Please enter a number between 1 and 9");
    }


    @Test
    public void shouldRedrawBoardIncludingPlayerInput(){
       String marker = "X";
       grid.drawWithInput(marker);

        assertEquals("X", positions.get(0));
    }




}