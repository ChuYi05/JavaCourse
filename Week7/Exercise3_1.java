import java.util.Random;
import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please input the numbers of students: ");
        int stuNum=input.nextInt();
        System.out.println("Please input the number of practices in lab class: ");
        int labNum=input.nextInt();
        int[][] records=new int[stuNum][labNum];
        Random r=new Random();
        for(int i=0;i<records.length;i++){
            for(int j=0;j<records[0].length;j++){
                records[i][j]=r.nextInt(10);
            }
        }
        for(int i=0;i<records.length;i++){
            for(int j=0;j<records[0].length;j++) {
                System.out.print(records[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
