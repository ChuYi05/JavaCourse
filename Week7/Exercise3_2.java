import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String info1=input.nextLine();
        String info2=input.nextLine();
        System.out.println(info1);
        System.out.println(info2);
        int[][] records=new int[5][10];
        for(int i=0;i<5;i++){
            for(int j=0;j<10;j++){
                if(input.hasNext()) {
                    records[i][j] = input.nextInt();
                }
            }
        }
        System.out.print("The absent SID is: ");
        for(int i=0;i<records.length;i++){
            int times=0;
            for(int j=0;j<records[0].length;j++){
                if(records[i][j]==0){
                    times+=1;
                }
            }
            if(times>1){
                System.out.print(i+" ");
            }
        }
        System.out.print("\n");
        double totalSum=0;
        double[] averageScore=new double[records[0].length];
        System.out.println("The average score of every lab is: ");
        for(int i=0;i<records[0].length;i++){
            int sum=0;
            for(int j=0;j<records.length;j++){
                sum+=records[j][i];
            }
            averageScore[i]=(float)sum/records.length;
            System.out.printf("%.1f ",averageScore[i]);
            totalSum+=averageScore[i];
        }
        System.out.print("\n");
        System.out.printf("The average score of lab class is: %.1f\n",(float)totalSum/records[0].length);
        System.out.printf("The poor performance lab index are: ");
        for(int i=0;i<records[0].length;i++){
            if(averageScore[i]<(float)totalSum/records[0].length){
                System.out.print(i+" ");
            }
        }
    }
}
