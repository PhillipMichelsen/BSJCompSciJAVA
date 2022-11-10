import java.util.Scanner;

public class RunQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String questionType, questionDifficulty, questionNumber;

        System.out.print("Enter question type ('L' for LoopingPrograms, 'SS' for SelectionStatementPrograms): ");
        questionType = sc.nextLine();

        if (questionType.equals("L")) questionType = "LoopingPrograms";
        else if (questionType.equals("SS")) questionType = "SelectionStatementPrograms";


        System.out.print("Enter question difficulty (E for Easy, M for Medium, H for Hard): ");
        questionDifficulty = sc.nextLine();

        questionDifficulty = switch (questionDifficulty) {
            case "E" -> "Easy";
            case "M" -> "Medium";
            case "H" -> "Hard";
            default -> questionDifficulty;
        };


        System.out.print("Enter question number: ");
        questionNumber= sc.nextLine();


        String className = questionType + "." + questionDifficulty + "." + "Question" + questionNumber;
        System.out.printf("\nRunning '%s'...\n\n",className);

        try {
            Class.forName(className).getMethod("question").invoke(null);
            Class.forName(className).getMethod("main", String[].class).invoke(null, (Object) args);
        } catch (Exception e) {
            System.out.println("Invalid question.");
        }

    }
}
