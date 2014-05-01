import Game.Game;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.*;


public class GameTest {


    private PrintStream out;

    @Before
    public void setUp() throws Exception {
        out = mock(PrintStream.class);

    }

    //    Make a move
//Prompt player 1 to enter a number between 1 and 9 to indicate where they wish to move.


    @Test
    public void shouldPlayerMakeAMove() throws IOException {
        Game game = new Game(out);
        game.start();
        verify(out).println("Please enter a number between 1 and 9");
    }

    // Redraw the board with an ‘X’ in that location.
// It doesn’t matter what happens if they enter anything besides a number from 1 to 9.

//    @Test
//    public void shouldRedrawGridWithUserInputOnIt(){
//
//    }
}