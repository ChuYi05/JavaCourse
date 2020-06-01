package Week6;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] m=new double[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m[i][j]=input.nextDouble();
            }
        }
        double[][] newM=new double[3][3];
        System.arraycopy(m,0,newM,0,3);
        for(int i=0;i<3;i++){
            Arrays.sort(newM[i]);
        }
        System.out.println("The row-sorted array is:");
        for(int i=0;i<3;i++){
            for(double a:newM[i])
                System.out.printf("%.2f ",a);
                System.out.printf("\n");
        }
    }
}
