package MiscPrograms.Sorting;
import java.util.Random;

public class NameAndMarks {
    public static void main(String[] args) {
        Random rand = new Random();

        String [] names = {"Edmund", "Rudolf", "Revant", "Dave", "Aarush", "Shane", "Panav", "Josh", "Warren", "Nabeel"};

        int [] marks = new int[10];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = rand.nextInt(100);
        }

        System.out.println("Names and Marks");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " = " + marks[i]);
        }

        for (int currentPass = 0; currentPass < marks.length; currentPass++) {
            int minIndex = currentPass;
            for (int currentIndex = currentPass + 1; currentIndex < marks.length; currentIndex++) {
                if (marks[currentIndex] < marks[minIndex]) {
                    minIndex = currentIndex;
                }
            }
            if (minIndex != currentPass) {

                int tempMarks = marks[currentPass];
                marks[currentPass] = marks[minIndex];
                marks[minIndex] = tempMarks;

                String tempNames = names[currentPass];
                names[currentPass] = names[minIndex];
                names[minIndex] = tempNames;
            }
        }

        System.out.println("\n\n----- SORTED -----");
        System.out.println("Names and Marks");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " = " + marks[i]);
        }

    }
}
