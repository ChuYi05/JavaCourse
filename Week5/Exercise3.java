package Week5;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.printf("Please input a number to print the multiplication table (0 to terminate):");
        for(int a=input.nextInt();a!=0;a=input.nextInt()) {
            if (a < 0 || a > 9) {
                System.out.println("The number you input is invalid, please input again");
            } else {
                for (int i = 1; i <= a; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.printf("%d*%d=%d ", j, i, i * j);
                    }
                    System.out.printf("\n");
                }
            }
            System.out.printf("Please input a number to print the multiplication table (0 to terminate):");
        }
        input.close();
    }
}
