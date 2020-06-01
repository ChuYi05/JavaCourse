package Assignment2;

import java.util.Scanner;

public class ProblemA {
    public static boolean DetermineOverlap(int[] recA,int[] recB){
        if(recB[3]<=recA[1]||recB[1]>=recA[3]||recB[0]>=recA[2]||recB[2]<=recA[0]){
            return false;
        }else return true;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=Integer.parseInt(input.nextLine());
        boolean[] result=new boolean[n];
        for(int i=0;i<n;i++){
            String coordinatesStr=input.nextLine();
            String[] value=coordinatesStr.split(" ");
            int[] RecA=new int[4];
            for(int j=0;j<4;j++){
                RecA[j]=Integer.parseInt(value[j]);
            }
            int[] RecB=new int[4];
            for(int j=0;j<4;j++){
                RecB[j]=Integer.parseInt(value[j+4]);
            }
            result[i]=DetermineOverlap(RecA,RecB);
        }
        for(int i=0;i<n-1;i++){
            if(result[i]==true){
                System.out.println("True");
            }else System.out.println("False");
        }
    }
}
