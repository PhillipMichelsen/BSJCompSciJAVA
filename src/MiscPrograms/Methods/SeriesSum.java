package MiscPrograms.Methods;
import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        SeriesSumOperations seriesSumOperations = new SeriesSumOperations();

        int x;
        int n;
        double seriesSum;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        x = scanner.nextInt();

        System.out.print("Enter n: ");
        n = scanner.nextInt();


        seriesSum = seriesSumOperations.calculateSeriesSum(x, n);

        System.out.printf("\nSum of series: %.2f", seriesSum);
    }
}

class SeriesSumOperations {
    public int calculateFactorial(int m) {
        int factorial = 1;
        for (int i = 1; i <= m; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public double calculatePower(int num, int exponent) {
        double power = 1;
        for (int i = 1; i <= exponent; i++) {
            power *= num;
        }

        return power;
    }

    public double calculateSeriesSum(int x, int n) {
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += calculatePower(x, (i*2)) / calculateFactorial((i*2)-1);
        }

        return sum;
    }
}
