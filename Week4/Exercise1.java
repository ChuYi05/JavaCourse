package Week4;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        double[] myList;
        int length;
        int i=0,p=0,m=0;
        System.out.println("Enter the length of myList: ");
        Scanner input=new Scanner(System.in);
        length=input.nextInt();
        myList=new double[length];
        System.out.printf("Enter %d values: ",length);
        while(i<myList.length){
            myList[i]=input.nextDouble();
            i++;
        }
        System.out.println("The array: ");
        while(p<myList.length){
            System.out.printf("%.1f ",myList[p]);
            p++;
        }
        myList[(myList.length-1)]=myList[0];
        for(int I=0;I<(myList.length-1);I++){
            myList[I]=myList[I+1];
        }
        System.out.println("\nThe shifted array: ");
        while(m<myList.length) {
            System.out.printf("%.1f ", myList[m]);
            m++;
        }
    }
}
