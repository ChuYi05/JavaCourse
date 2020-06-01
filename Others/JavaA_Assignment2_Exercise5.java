package Others;
import java.util.Scanner;
import java.util.ArrayList;

public class JavaA_Assignment2_Exercise5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i=input.nextInt();
        ArrayList<int[][]> M=new ArrayList<>();
        for(int p=0;p<i;p++){
            int m=input.nextInt();
            int n=input.nextInt();
            int[][] eachM=new int[m][n];
            for(int q=0;q<m;q++){
                for(int s=0;s<n;s++){
                    eachM[q][s]=input.nextInt();
                }
            }
            M.add(eachM);
        }
        int[][] result=new int[M.get(0).length][60];
        for(int p=0;p<M.get(0).length;p++){
            for (int q=0;q<M.get(0)[p].length;q++) {
                result[p][q]=M.get(0)[p][q];
            }
        }
        for(int p=0;p<i-1;p++){
            int[][] newResult=new int[result.length][60];
            for(int q=0;q<result.length;q++){
                for(int s=0;s<M.get(p+1)[0].length;s++){
                    for(int g=0;g<M.get(p+1).length;g++){
                        newResult[q][s]+=result[q][g]*M.get(p+1)[g][s];
                    }
                }
            }
            result=newResult;
        }
        for(int p=0;p<M.get(0).length;p++){
            for(int q=0;q<M.get(i-1)[0].length;q++){
                System.out.print(result[p][q]+" ");
            }
            System.out.print("\n");
        }
    }
}
