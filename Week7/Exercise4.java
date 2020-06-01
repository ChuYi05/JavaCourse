package Week7;
import edu.princeton.cs.algs4.StdDraw;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.print("Please input the n: ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        StdDraw.filledSquare(0.5,0.5,0.5);
        StdDraw.setPenColor(StdDraw.BOOK_RED);
        double r=(float)1/n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                StdDraw.filledSquare((2*j+1)*r+r/2,(2*i+1)*r+r/2,r/2);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                StdDraw.filledSquare((2*j)*r+r/2,(2*i)*r+r/2,r/2);
            }
        }
    }
}
