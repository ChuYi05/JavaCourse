package Week6;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

class Method {
    public static boolean[] getAbsent(int[][] records){
        int studentNumber=records.length;
        int labNumber=records[0].length;
        boolean[] Absent=new boolean[studentNumber];
        for(int i=0;i<studentNumber;i++){
            int sum=0;
            for(int j=0;j<labNumber;j++){
                if(records[i][j]==0){
                    sum+=1;
                }
            }
            if(sum>=2){
                Absent[i]=true;
            }
            else {
                Absent[i]=false;
            }
        }
        return Absent;
    }
}

public class Exercise1{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.printf("Please input the number of students: ");
        int studentNumber=input.nextInt();
        System.out.printf("Pleas input the number of practises in lab class: ");
        int labNumber=input.nextInt();
        int[][] records=new int[studentNumber][labNumber];
        Random r=new Random();
        for(int i=0;i<studentNumber;i++){
            for(int j=0;j<labNumber;j++){
                records[i][j]=r.nextInt(6);
            }
        }
        for(int i=0;i<studentNumber;i++){
            System.out.println("s_"+i+":"+Arrays.toString(records[i]));
        }
        System.out.print("The absent SID is: ");
        boolean absent[]=Method.getAbsent(records);
        for(int i=0;i<studentNumber;i++){
            if(absent[i]==true){
                System.out.print(i );
            }
        }
    }
}
