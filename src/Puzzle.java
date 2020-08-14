import java.util.Scanner;
public class Puzzle {

    private int PuzzleNumber;
    private String PuzzleName;
    private String PuzzleDescription;
    private String Answer;
    private int NumberOfAttempts;

    public Puzzle(int PuzzleNumber, String PuzzleName, String PuzzleDescription, String Answer, int NumberOfAttempts) {
        setPuzzleNumber(PuzzleNumber);
        setPuzzleName(PuzzleName);
        setPuzzleDescription(PuzzleDescription);
        setAnswer(Answer);
        setNumberOfAttempts(NumberOfAttempts);
    }

    //Getters
    public int getPuzzleNumber() {
        return this.PuzzleNumber;
    }
    public String getPuzzleName() {
        return this.PuzzleName;
    }
    public String getPuzzleDescription() {
        return this.PuzzleDescription;
    }
    public String getAnswer() {
        return this.Answer;
    }
    public int getNumberOfAttempts() { return this.NumberOfAttempts; }

    //Setters
    public void setPuzzleNumber(int puzzleNumber) {
        PuzzleNumber = puzzleNumber;
    }
    public void setPuzzleName(String puzzleName) {
        PuzzleName = puzzleName;
    }
    public void setPuzzleDescription(String puzzleDescription) {
        PuzzleDescription = puzzleDescription;
    }
    public void setAnswer(String answer) {
        Answer = answer;
    }
    public void setNumberOfAttempts(int numberOfAttempts) {
        NumberOfAttempts = numberOfAttempts;
    }

    public boolean displayPuzzle () {
        System.out.println(PuzzleName);
        System.out.println(PuzzleDescription);
        Scanner input = new Scanner(System.in);
        String inputAnswer = Answer;
        inputAnswer = input.nextLine();

        while (NumberOfAttempts > 1) {
            if (inputAnswer.equals(Answer)) {
                System.out.println("You solved the puzzle correctly!");
                return false;
            }
            else if (inputAnswer.toUpperCase().equals("IGNORE")) {
                System.out.println("You ignored the puzzle");
                return false;
            }
            else {
                NumberOfAttempts--;
                System.out.println("The answer you provided is wrong, you still have " + NumberOfAttempts + " more attempt(s) Try again");
                inputAnswer = input.nextLine();
            }
        }

        System.out.println("You failed to solve the puzzle");
        return false;
    }

}
