import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class Main {


    private static ArrayList<String> positions;
    private static PrintStream printStream;

    public static void main(String[] args) throws IOException {
       PrintStream out = System.out;
       BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
       Game game = new Game(out, reader);
       game.start();
    }

}
