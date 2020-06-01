package Assignment1;

import java.util.Scanner;
//思路是除去第一个数【0】，并且判断第一个数是否需要打印，然后除去和第一个数相同的数，并且构建新的数组；
//心得是新的数组直接覆盖原数组这一技巧
//问题是一旦原数组含0就会导致程序终结

public class ProblemB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i <= (n - 1); i++) {
            numbers[i] = input.nextInt();
        }
        input.close();
        int[] numbers2=new int[n];
        int k=0;
        for(int i=0;i<=n-1;i++){
            if(numbers[i]==0){
            }else {
                numbers2[k]=numbers[i];
                k++;
            }
        }
        if(numbers2[n-1]==0&&numbers2[n-2]!=0){
            System.out.printf("0 ");
        }//这样可以起到除0的作用，但缺点是0永远第一个打印出来
        numbers=numbers2;
        while(numbers[0]!=0) {
            int[] numbers3 = new int[n];
            int m = 0;
            for (int j = 1; j <= numbers.length-1; j++) {
                if (numbers[j] == numbers[0]) {
                    numbers3[n-1]=1;
                } else {
                    numbers3[m] = numbers[j];
                    m++;
                }
            }
            if(numbers3[n-1]==0||numbers[0]==0){
                System.out.printf("%d ",numbers[0]);
            }else {
            }
            numbers = numbers3;
        }
    }
}
