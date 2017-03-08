import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by sergi.castillo on 8/3/17.
 */
public class TicTacToeShould {

    @Test
    public void print_board() throws Exception {
        TicTacToe ticTacToe = new TicTacToe();

        boolean result = ticTacToe.print();

        assertThat(result, is(Boolean.TRUE));

    }
}
