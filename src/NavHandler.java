import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NavHandler {
    // Handles the answer and outputs an Integer
    public static int ResultfromNavAnswer (String answer, int[] r1) {

        Scanner keyboard = new Scanner(System.in);
        // expects North, East, South, or West as an answer
        boolean validAnswer = false;
        while (validAnswer == false) {

                // if the Answer is NORTH
                if (answer.toUpperCase().equals("NORTH")) {
                    if (r1[0] == 0) {
                        System.out.println("You cannot go that way");
                        answer = keyboard.nextLine();
                    } else if (r1[0] >= 1) {
                        validAnswer = true;
                        return r1[0];
                    }
                }
                // if the Answer is EAST
                else if (answer.toUpperCase().equals("EAST")) {
                    if (r1[1] == 0) {
                        System.out.println("You cannot go that way");
                        answer = keyboard.nextLine();
                    } else if (r1[1] >= 1) {
                        validAnswer = true;
                        return r1[1];
                    }
                }
                // if the Answer is SOUTH
                else if (answer.toUpperCase().equals("SOUTH")) {
                    if (r1[2] == 0) {
                        System.out.println("You cannot go that way");
                        answer = keyboard.nextLine();
                    } else if (r1[2] >= 1) {
                        validAnswer = true;
                        return r1[2];
                    }
                }
                // if the Answer is WEST
                else if (answer.toUpperCase().equals("WEST")) {
                    if (r1[3] == 0) {
                        System.out.println("You cannot go that way");
                        answer = keyboard.nextLine();
                    } else if (r1[3] >= 1) {
                        validAnswer = true;
                        return r1[3];
                    }
                }

                // if the Answer is anything but NORTH, EAST, SOUTH, or WEST
                else {
                    return -1;
                }
            }


        return 1;
    }
}
