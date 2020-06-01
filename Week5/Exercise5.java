package Week5;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a credit and a score(-1 to terminate):");
        float sum = 0;
        float totalCredit = 0;
        double GPA;
        for (int i = input.nextInt(); i != (-1); i = input.nextInt()) {
            int j = input.nextInt();
            totalCredit += i;
            if (j < 0 || j > 100) {
                System.out.println("Invalid score!");
            } else {
                switch (j / 10) {
                    default:break;
                    case 6:
                        sum += i;
                        break;
                    case 7:
                        sum += 2 * i;
                        break;
                    case 8:
                        sum += 3 * i;
                        break;
                    case 9:
                        sum += 4 * i;
                        break;
                    case 10:
                        sum += 4 * i;
                        break;
                }

            }
        }
        GPA = sum / totalCredit;
        System.out.printf("The final GPA is %.1f", GPA);
    }
}
