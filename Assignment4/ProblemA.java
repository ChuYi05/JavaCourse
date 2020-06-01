package Assignment4;
//其他都没有问题，主要还是要反思算法的问题

import java.util.ArrayList;
import java.util.Scanner;


public class ProblemA {
    public static void main(String[] args) {
        //读取题目，并且将所有的题目全部存储
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        int[] carsNumber = new int[n];
        ArrayList<Integer>[] cars = new ArrayList[n];//创建车的序列的数组，注意List的数组的创建方式
        for (int i = 0; i < n; i++) {
            carsNumber[i] = input.nextInt();
            input.nextLine();
            cars[i] = new ArrayList<>();//记得每一个List都还需要创建才行
            for (int j = 0; j < carsNumber[i]; j++) {
                cars[i].add(input.nextInt());
            }
            input.nextLine();
        }
        input.close();


        if(n==0){
            System.out.println("null");
        }else {
            //打印出所有可以存活的汽车
            for (int i = 0; i < n; i++) {
                int c=0;
                for (int j = 0; j < carsNumber[i]; j++) {//不用考虑数量为0的情况，因为若车的数量为0，结果正好是打印“null”
                    if (cars[i].get(j) > 0) {
                        if (positiveSurvive(cars[i], j)) {
                            System.out.print(cars[i].get(j) + " ");
                            c++;
                        }
                    } else {
                        if (negativeSurvive(cars[i], j)) {
                            System.out.print(cars[i].get(j) + " ");
                            c++;
                        }
                    }//由题意，不考虑车速为0的情况
                }
                if(c==0){
                    System.out.println("null");
                }else {
                    System.out.println();
                }
            }
        }
    }


        //求指定范围内的最大的正数和最小的负数,并且记录下最值的数量
        public static int maximum (ArrayList<Integer> list,int start,int end){
            int maximum = 0;
            for (int i = start; i < end+1; i++) {
                if (list.get(i) > maximum&&list.get(i)>0) {
                    maximum = list.get(i);
                }
            }
            return maximum;
        }
        public static int minimum (ArrayList < Integer > list,int start, int end){
            int minimum = 0;
            for (int i = start; i < end+1; i++) {
                if (list.get(i) < minimum&&list.get(i)<0) {
                    minimum = list.get(i);
                }
            }
            return minimum;
        }


        //记录制定范围里面相同数字的数量
        public static int count(ArrayList<Integer> list,int number,int start,int end){
            int a=0;
            for(int i=start;i<end+1;i++){
                if(number==list.get(i)){
                    a++;
                }
            }
            return a;
        }


        //判断车是否能存活
        public static boolean positiveSurvive(ArrayList<Integer> list,int thisCar){
            int a,b;
            for(int i=thisCar+1;i<list.size();i++){
                if(list.get(i)<0){
                    if(maximum(list,thisCar,i-1)<Math.abs(list.get(i))){
                        return false;
                    }
                    if(maximum(list,thisCar,i-1)==Math.abs(list.get(i))) {
                        a=count(list,list.get(thisCar),thisCar,i);
                        b=count(list,list.get(i),thisCar,i);
                        if(a>b){

                        }else return false;
                    }
                }
            }
            return true;
        }
        public static boolean negativeSurvive(ArrayList<Integer> list,int thisCar){
            int a,b;
            for(int i=thisCar-1;i>=0;i--){
            if(list.get(i)>0){
                if(Math.abs(minimum(list,i+1,thisCar))<list.get(i)){
                    return false;
                }
                if(Math.abs(minimum(list,i+1,thisCar))==list.get(i)){
                    a=count(list,list.get(thisCar),i,thisCar);
                    b=count(list,list.get(i),i,thisCar);
                    if(a>b){

                    }else return false;
                }
            }
            }
            return true;
        }
}
