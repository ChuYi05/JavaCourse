package Week7;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Exercise2 {
    public static void generateArray(int[][] records){
        Random r=new Random();
        for(int i=0;i<records.length;i++){
            for(int j=0;j<records[0].length;j++){
                records[i][j]=r.nextInt(10);
            }
        }
    }

    public static void printArray(int[][] records){
        for(int i=0;i<records.length;i++){
                System.out.println("S_"+i+":"+Arrays.toString(records[i]));
        }
    }

    public static void printAbsentID(int[][] records){
        System.out.print("The absent SID is: ");
        for(int i=0;i<records.length;i++){
            int times=0;
            for(int j=0;j<records[0].length;j++){
                if(records[i][j]==0){
                    times+=1;
                }
            }
            if(times>1){
                System.out.print(i+" ");
            }
        }
        System.out.print("\n");
    }

    public static void printPoorLabID(int[][] records){
        double totalSum=0;
        double[] averageScore=new double[records[0].length];
        System.out.println("The average score of every lab is: ");
        for(int i=0;i<records[0].length;i++){
            int sum=0;
            for(int j=0;j<records.length;j++){
                sum+=records[j][i];
            }
            averageScore[i]=(float)sum/records.length;
            System.out.printf("%.1f ",averageScore[i]);
            totalSum+=averageScore[i];
        }
        System.out.print("\n");
        System.out.printf("The average score of lab class is: %.1f\n",(float)totalSum/records[0].length);
        System.out.printf("The poor performance lab index are: ");
        for(int i=0;i<records[0].length;i++){
            if(averageScore[i]<(float)totalSum/records[0].length){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please input the number of students: ");
        int sNum=input.nextInt();
        System.out.print("Please input the number of practices in the lab class: ");
        int labNum=input.nextInt();
        int[][] records=new int[sNum][labNum];
        generateArray(records);
        printArray(records);
        printAbsentID(records);
        printPoorLabID(records);
    }
}
