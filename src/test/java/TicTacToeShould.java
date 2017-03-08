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

    @Test
    public void print_first_movement() throws Exception {
        TicTacToe ticTacToe = new TicTacToe();
        int x = 0;
        int y = 0;

        Token.Type token = ticTacToe.print(x,y);

        assertThat(token, is(Token.Type.CROSS));

    }

    @Test
    public void print_second_movement() throws Exception {
        TicTacToe ticTacToe = new TicTacToe();
        int x = 0;
        int y = 1;

        Token.Type token = ticTacToe.print(x,y);

        assertThat(token, is(Token.Type.CIRCLE));

    }

    @Test
    public void check_position() throws Exception {
        TicTacToe ticTacToe = new TicTacToe();
        int x = 0;
        int y = 0;
        boolean check = ticTacToe.checkPosition(x,y);
        assertThat(check, is(true));

    }

    @Test
    public void fail_after_fist_movement() throws Exception {
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.print(0,0);
        boolean check = ticTacToe.checkPosition(0,0);
        assertThat(check, is(false));


    }
}
