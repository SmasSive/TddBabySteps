/**
 * Created by sergi.castillo on 8/3/17.
 */
public class TicTacToe {
    public boolean print() {
        return true;
    }

    public Token.Type print(int x, int y) {
        if (x == 0 && y == 0) {
            return Token.Type.CROSS;
        } else {
            return Token.Type.CIRCLE;
        }
    }

    public boolean checkPosition(int x, int y) {
        return true;
    }
}
