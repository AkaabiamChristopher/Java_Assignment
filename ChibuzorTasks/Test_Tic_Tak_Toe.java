import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test_Tic_Tak_Toe {

    @BeforeEach
    public void setUp() {
        Tic_Tak_Toe.initializeBoard();
    }

    @Test
    public void testAddPlayerToken() {
        Tic_Tak_Toe.addPlayerToken('X', 1);
        assertArrayEquals(new char[]{'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, Tic_Tak_Toe.board);
        Tic_Tak_Toe.addPlayerToken('O', 5);
        assertArrayEquals(new char[]{'X', ' ', ' ', ' ', 'O', ' ', ' ', ' ', ' '}, Tic_Tak_Toe.board);
    }

    @Test
    public void testCheckIfWon() {
        Tic_Tak_Toe.board = new char[]{'X', 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' '};
        assertTrue(Tic_Tak_Toe.checkIfWon('X'));

        Tic_Tak_Toe.board = new char[]{'O', ' ', ' ', 'O', ' ', ' ', 'O', ' ', ' '};
        assertTrue(Tic_Tak_Toe.checkIfWon('O'));
        Tic_Tak_Toe.board = new char[]{'X', ' ', ' ', ' ', 'X', ' ', ' ', ' ', 'X'};
        assertTrue(Tic_Tak_Toe.checkIfWon('X'));
        Tic_Tak_Toe.board = new char[]{'X', 'O', 'X', 'O', 'X', 'O', 'O', 'X', 'O'};
        assertFalse(Tic_Tak_Toe.checkIfWon('X'));
    }

    @Test
    public void testCheckIfFull() {
        Tic_Tak_Toe.board = new char[]{'X', 'O', 'X', 'O', 'X', 'O', 'O', 'X', 'O'};
        assertTrue(Tic_Tak_Toe.checkIfFull());
        Tic_Tak_Toe.board = new char[]{'X', 'O', 'X', 'O', 'X', 'O', 'O', 'X', ' '};
        assertFalse(Tic_Tak_Toe.checkIfFull());
    }

    @Test
    public void testPlayerMovesXWins() {
        int[] moves = {1, 2, 4, 5, 7};
        Tic_Tak_Toe.testPlayerMoves(moves);
        assertTrue(Tic_Tak_Toe.checkIfWon('X'));
    }
    @Test
    public void testPlayerMovesDraw() {
        int[] moves = {1, 2, 3, 5, 4, 8, 6, 7, 9};
        Tic_Tak_Toe.testPlayerMoves(moves);
        assertFalse(Tic_Tak_Toe.checkIfFull());
        assertFalse(Tic_Tak_Toe.checkIfWon('X'));
        assertTrue(Tic_Tak_Toe.checkIfWon('O'));
    }
}
