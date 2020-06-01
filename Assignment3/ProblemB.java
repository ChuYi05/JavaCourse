package Assignment3;
//当程序一直在跑但是没有结果出来的情况下，不仅有可能是死循环，也有可能是运算量太大
//(int)Math.pow(,)的时候一定要注意int的范围
import java.util.Scanner;

public class ProblemB {
    public static int transfer(boolean a){
        if(a==true){
            return 1;
        }else return 0;
    }

    public static int decideSquare(long a){
        int c;
        if(a==1){
            c=0;
        }else {
            for (int i=0; ; i++) {
                if (Math.pow(2, i) < a && a <= Math.pow(2, i + 1)) {
                    c = i;
                    break;
                }
            }
        }
        return c;
    }

    public static boolean findSequence(int N,long K){
        int count=0;
        boolean result;
        if(K<=Math.pow(2,N-2)){//从头开始的“标号”
            while (decideSquare(K) > 0) {
                K = K -(long)Math.pow(2,decideSquare(K));
                count++;
            }
            if(K==2){
                result=true;
            }else result=false;
            for(int i=0;i<count;i++){
                result=!result;
            }
        }else {
            while (decideSquare((long)Math.pow(2,N-1)-K +1)>0 ){//和末尾的数相比的“标号”
                K = K +(long)Math.pow(2,decideSquare((long)Math.pow(2,N-1)-K +1));
                count++;
            }
            if(N%2==0){
                if(K==(long)Math.pow(2,N-1)){
                    result=true;
                }else result=false;
            }else {
                if(K==(long)Math.pow(2,N-1)){
                    result=false;
                }else result=true;
            }
            for(int i=0;i<count;i++){
                result=!result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] Nseries=new int[n];
        long[] Kseries=new long[n];
        for(int i=0;i<n;i++){
            Nseries[i]=input.nextInt();
            Kseries[i]=input.nextLong();
        }
        input.close();

        for(int i=0;i<n;i++){
            System.out.println(transfer(findSequence(Nseries[i],Kseries[i])));
        }
    }
}
