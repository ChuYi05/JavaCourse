package Assignment1;
import java.util.Scanner;

public class ProblemA {
    static int Dissolve(int a){
        int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        input.close();
        for(int i=1;i<=n;i++){
            if(Dissolve(i)%2==1){
                System.out.printf("%d ",i);
            }
        }
    }
}
