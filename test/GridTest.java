import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by gzamudio on 5/1/14.
 */
public class GridTest {

    @Test
    public void something(){
        Grid grid = new Grid();
        grid.print();
        assertTrue(" | | ", true);
    }


}
