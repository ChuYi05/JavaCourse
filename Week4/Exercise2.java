package Week4;
import java.util.Scanner;

class Max{
    static double max(double[] list){
        int i=1;
        double x=list[0];
        while(i<list.length){
            if(x<list[i]){
                x=list[i];
            }
            i++;
        }
        return x;
    }
}

class Min{
    static double min(double[] list){
        int i=1;
        double x=list[0];
        while(i<list.length){
            if(x>list[i]){
                x=list[i];
            }
            i++;
        }
        return x;
    }
}

public class Exercise2 {
    public static void main(String[] args){
        double[] scoreList=new double[10];
        int i=0;
        System.out.println("Please input 10 scores of these students: ");
        Scanner input=new Scanner(System.in);
        while(i<10){
            scoreList[i]=input.nextDouble();
            i++;
        }
        double[] newList=new double[8];
        int j=0,k=0;
        while(j<scoreList.length){
            if(scoreList[j]!=Max.max(scoreList)&&scoreList[j]!=Min.min(scoreList)){
                newList[k]=scoreList[j];
                k++;
            }
            j++;
        }
        double sum=0;
        int p=0;
        while(p<8) {
            sum+=newList[p];
            p++;
        }
        System.out.printf("Average score is: %.2f",(sum/8));
    }
}
