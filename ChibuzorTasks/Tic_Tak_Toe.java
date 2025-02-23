import java.util.Scanner;

public class Tic_Tak_Toe {

    public static char[] board = new char[9];

    public static void initializeBoard() {
        for (int i = 0; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    public static void displayBoard() {
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("-------------");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("-------------");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
    }

    public static void addPlayerToken(char token, int move) {
        if (board[move - 1] != ' ') {
            System.out.println("Space already filled, try again.");
            return;
        }
        board[move - 1] = token;
        displayBoard();
    }

    public static boolean checkIfWon(char token) {
        return (board[0] == token && board[1] == token && board[2] == token) ||
                (board[3] == token && board[4] == token && board[5] == token) ||
                (board[6] == token && board[7] == token && board[8] == token) ||
                (board[0] == token && board[3] == token && board[6] == token) ||
                (board[1] == token && board[4] == token && board[7] == token) ||
                (board[2] == token && board[5] == token && board[8] == token) ||
                (board[0] == token && board[4] == token && board[8] == token) ||
                (board[2] == token && board[4] == token && board[6] == token);
    }

    public static boolean checkIfFull() {
        for (char cell : board) {
            if (cell == ' ') {
                return false;
            }
        }
        return true;
    }

    public static void playerMoves() {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (count <= 9) {
            char token = (count % 2 == 0) ? 'O' : 'X';
            System.out.println("Player " + token + ", enter a position (1-9): ");
            int move = scanner.nextInt();
            addPlayerToken(token, move);
            if (checkIfWon(token)) {
                System.out.println("Player " + token + " won!");
                return;
            }
            if (checkIfFull()) {
                System.out.println("It's a draw!");
                return;
            }
            count++;
        }
    }


    public static void testPlayerMoves(int[] moves) {
        int count = 1;
        for (int move : moves) {
            char token = (count % 2 == 0) ? 'O' : 'X';
            addPlayerToken(token, move);
            if (checkIfWon(token)) {
                System.out.println("Player " + token + " won!");
                return;
            }
            if (checkIfFull()) {
                System.out.println("It's a draw!");
                return;
            }
            count++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe!");
        initializeBoard();
        displayBoard();
        playerMoves();
    }
}
