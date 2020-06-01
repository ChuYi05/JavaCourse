package Assignment1;
import java.util.Scanner;

public class ProblemC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        if (n == 1) {
            System.out.printf("*");
        } else {
            for (int i = 1; i <= (n - 1) / 2; i++) {
                System.out.printf(" ");
            }
            System.out.println("*");
            for (int i = 1; i <= ((n - 3) / 2); i++) {
                for (int m = i; m <= (n - 3) / 2; m++) {
                    System.out.printf(" ");
                }
                System.out.printf("/");
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.printf("*");
                }
                System.out.printf("\\");
                System.out.printf("\n");
            }

            System.out.printf("|");
            for (int i = 1; i <= n - 2; i++) {
                System.out.printf("*");
            }
            System.out.printf("|\n");

            for (int i = (n - 3) / 2; i >= 1; i--) {
                for (int m = i; m <= (n - 3) / 2; m++) {
                    System.out.printf(" ");
                }
                System.out.printf("\\");
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.printf("*");
                }
                System.out.printf("/\n");
            }
            for (int i = 1; i <= (n - 1) / 2; i++) {
                System.out.printf(" ");
            }
            System.out.printf("*");
        }
    }
}
