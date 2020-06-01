package Week6;
import Week1_2020_02_10.Exercise;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import sun.applet.Main;

import java.util.Scanner;

public class Exercise3 {
    public static boolean isMarkovMatrix(double[][] m){
        boolean result=true;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(m[i][j]<=0){
                    result=false;
                }
            }
        }
        for(int i=0;i<3;i++){
            double sum=0;
            for(int j=0;j<3;j++){
                sum+=m[j][i];
            }
            if(sum!=1){
                result=false;
            }
        }
        return result;
    }

    public static void main(String[] args){
        double[][] m=new double[3][3];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a 3-by-3 markov matrix row by row:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m[i][j]=input.nextDouble();
            }
        }
        if(isMarkovMatrix(m)==true){
            System.out.println("It is a Markov Matrix.");
        }
        else {
            System.out.println("It is not a Markov Matrix.");
        }
    }
}
