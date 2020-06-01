package Week6;
import java.util.Scanner;
import java.util.Arrays;

public class Exercise5 {
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
        for(int i=0;i<3;i++) {
            System.arraycopy(m[i], 0, newM[i], 0, 3);
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                newM[i][j]=m[j][i];
            }
        }
        for(int i=0;i<3;i++){
            Arrays.sort(newM[i]);
        }
        double[][] newNewM=new double[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                newNewM[i][j]=newM[j][i];
            }
        }
        System.out.println("The column-sorted array is:");
        for(int i=0;i<3;i++){
            for(double a:newNewM[i])
                System.out.printf("%.2f ",a);
                System.out.print("\n");
        }
    }
}
