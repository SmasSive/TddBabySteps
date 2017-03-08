/**
 * Created by sergi.castillo on 8/3/17.
 */
public class TicTacToe {

    boolean[][] isFree = new boolean[3][3];

    public TicTacToe() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                isFree[i][j] = true;
            }
        }
    }

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
        return isFree[x][y];
    }
}
