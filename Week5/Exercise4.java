package Week5;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.printf("The 1st 25 items are:\n0          1          ");
        int[] F = new int[25];
        F[0] = 0;
        F[1] = 1;
        for (int i = 2; i <= 24; i++) {
            F[i] = F[i - 1] + F[i - 2];
            if (i % 5 == 0) {
                System.out.printf("\n");
            }
            System.out.printf("%-10d ", F[i]);
        }
        System.out.println("\nThe items whose values range from 100 to 1000:");
        int a;
        for (int n = 0; n <= 24; n++) {
            if ((F[n] > 100) && (F[n] < 1000)) {
                System.out.printf("%-5d", F[n]);
            }
        }
    }
}
