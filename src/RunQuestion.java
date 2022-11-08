import java.util.Scanner;

public class RunQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String questionType, questionDifficulty, questionNumber;

        System.out.print("Enter question type (LoopingPrograms or SelectionStatementPrograms): ");
        questionType = sc.nextLine();

        System.out.print("Enter question difficulty (Easy, Medium, Hard): ");
        questionDifficulty = sc.nextLine();

        System.out.print("Enter question number: ");
        questionNumber= sc.nextLine();


        String className = questionType + "." + questionDifficulty + "." + "Question" + questionNumber;
        System.out.printf("\nRunning '%s'...\n\n",className);

        try {
            Class.forName(className).getMethod("main", String[].class).invoke(null, (Object) args);
        } catch (Exception e) {
            System.out.println("Invalid question.");
        }

    }
}
