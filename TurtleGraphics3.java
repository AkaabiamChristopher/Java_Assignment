import java.util.Scanner;

public class TurtleGraphics3 {
    public static void main(String[] args) {
        int floor[][] = new int[20][20];      
	int x = 0, y = 0;
        boolean penDown = false; 
        int direction = 0;
        int[] commands = {2, 5, 10, 3, 5, 5, 4, 5, 10, 1, 6, 9};
	
	System.out.print("Enter commands: ");
	int commands = Scanner.nextInt();
        for (int command : commands) {
            if (command == 1) {
                penDown = false;
            } else if (command == 2) {
                penDown = true;
            } else if (command == 3) {
                direction = (direction + 1) % 4;
            } else if (command == 4) {
                direction = (direction + 3) % 4;
            } else if (command == 5) {
                int spaces = 10;

                for (int i = 0; i < spaces; i++) {
                    if (direction == 0) {
                        if (x + 1 < 20) x++;
                    } else if (direction == 1) {
                        if (y + 1 < 20) y++;
                    } else if (direction == 2) {
                        if (x - 1 >= 0) x--;
                    } else if (direction == 3) {
                        if (y - 1 >= 0) y--;
                    }
                    if (penDown) {
                        floor[y][x] = 1;
                    }
                }
            } else if (command == 6) {
                for (int row = 0; row < 20; row++) {
                    for (int col = 0; col < 20; col++) {
                        System.out.print(floor[row][col] == 1 ? "*" : " ");
                    }
                    System.out.println();
                }
            } else if (command == 9) {
                break;
            }
        }
    }
}

