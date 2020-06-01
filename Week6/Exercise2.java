package Week6;
import java.util.Scanner;

public class Exercise2 {
    public static void displayElements(double[][] m){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(m[i][j]);
            }
            System.out.println("\n");
        }
    }

    public static double sumColumn(double[][] m,int columnIndex){
        double sum=0;
        for(int i=0;i<4;i++){
            sum+=m[i][columnIndex];
        }
        return sum;
    }

    public static double sumMajorDiagonal(double[][] m){
        double sum=0;
        for(int i=0;i<4;i++){
            sum+=m[i][i];
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println("Enter a 4-by-4 matrix row by row:");
        Scanner input=new Scanner(System.in);
        double[][] m=new double[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                m[i][j]=input.nextDouble();
            }
        }
        System.out.println("The input 4-by-4 matrix is:");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.print("\n");
        }
        for(int i=0;i<4;i++){
            System.out.println("Sum of elements of column"+ i+" is "+sumColumn(m,i));
        }
        System.out.println("Sum of elements in the major diagonal is "+sumMajorDiagonal(m));
    }
}
