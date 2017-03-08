/**
 * Created by sergi.castillo on 8/3/17.
 */
public class TicTacToe {
    public boolean print() {
        return true;
    }

    public Token.Type print(int position) {
        if (position == 0) {
            return Token.Type.CROSS;
        } else {
            return Token.Type.CIRCLE;
        }
    }
}
