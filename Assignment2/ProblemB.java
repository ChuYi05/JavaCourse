package Assignment2;

import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] allxyz = new int[n][3];
        for(int i=0;i<n;i++){
            allxyz[i][0]=input.nextInt();
            allxyz[i][1]=input.nextInt();
            allxyz[i][2]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            if(allxyz[i][0]+allxyz[i][1]<allxyz[i][2]){
                System.out.println("False");
            }else {
                if (allxyz[i][0] == 0 || allxyz[i][1] == 0) {
                    if (allxyz[i][2] == allxyz[i][0] || allxyz[i][2] == allxyz[i][1]) {
                        System.out.println("True");
                    } else System.out.println("False");
                } else {
                    int c = 1;
                    for (int j = 1; j < Math.max(allxyz[i][0], allxyz[i][1]); j++) {
                        if (allxyz[i][0] % j == 0 && allxyz[i][1] % j == 0) {
                            c = j;
                        }
                    }
                    if (allxyz[i][2] % c == 0) {
                        System.out.println("True");
                    } else System.out.println("False");
                }
            }
        }
    }
}
