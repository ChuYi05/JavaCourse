package Assignment4;
//本题目还没有考虑除数为0的情况


import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;


public class ProblemB {
    public static void main(String[] args) {
        //将每一行表达式存储在String中
        //将表达式分离成数字和符号，分别存储在数列中
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        String[] allOperations=new String[n];
        for(int i=0;i<n;i++){
            allOperations[i]=input.nextLine();
        }
        ArrayList<Double>[] allNumbers = new ArrayList[n];
        ArrayList<String>[] allOperators = new ArrayList[n];


        for(int i=0;i<n;i++) {
            while (allOperations[i].indexOf('(')!=-1) {//先消除括号
                int left = allOperations[i].lastIndexOf('(');
                int right = allOperations[i].indexOf(')', left);
                String inBracket = allOperations[i].substring(left + 1, right );
                Double newNum = noBracket(inBracket);
                if(left!=0) {
                    allOperations[i] = allOperations[i].substring(0, left ) + newNum + allOperations[i].substring(right+1);
                }else {
                    allOperations[i] = newNum + allOperations[i].substring(right + 1);//括号在最左边的情况
                }
            }
            System.out.printf("%.0f",noBracket(allOperations[i]));
            System.out.println();
        }
    }


    public static double noBracket(String raw){
        ArrayList<Double> numbers=splitNumbers(raw);
        ArrayList<Character> operators=splitOperators(raw);
        for(int i=0;i<operators.size();i++){
            Character ch=operators.get(i);
            if(ch=='*'||ch=='/'){
                operators.remove(i);
                Double num1=numbers.remove(i);
                Double num2=numbers.remove(i);
                if(ch=='*'){
                    numbers.add(i,num1*num2);
                }
                if(ch=='/') {
                    numbers.add(i, num1 / num2);
                }
                i--;
            }
        }
        while(!operators.isEmpty()){
            Character ch2=operators.remove(0);
            Double num3=numbers.remove(0);
            Double num4=numbers.remove(0);
            if (ch2 == '+') {
                numbers.add(0,num3+num4);
            }
            if (ch2 == '-') {
                numbers.add(0,num3-num4);
            }
        }
        return numbers.get(0);
    }


    public static ArrayList<Double> splitNumbers(String raw){
        String after=process(raw);
        Pattern p1= Pattern.compile(("\\+|\\-|\\*|\\/"));
        String[] split=p1.split(after);

        ArrayList<Double> result=new ArrayList<>();
        for(int i=0;i<split.length;i++){
            if(split[i].charAt(0)=='#'){
                split[i]="-"+split[i].substring(1);
            }
            result.add(Double.parseDouble(split[i]));
        }
        return result;
    }


    public static ArrayList<Character> splitOperators(String raw){
        String after=process(raw);
        Pattern p2= Pattern.compile(("#?\\d"));
        String[] split=p2.split(after);

        ArrayList<Character> result=new ArrayList<>();
        for(int i=0;i<split.length;i++){
            if(split[i].trim().equals("+")||split[i].trim().equals("-")||split[i].trim().equals("*")||split[i].trim().equals("/")){
                result.add(split[i].trim().charAt(0));
            }
        }
        return result;
    }


    public static String process(String raw){
        for(int i=0;i<raw.length();i++){
            Character ch=raw.charAt(0);
            if(ch=='-'){
                if(i==0){
                    raw="#"+raw.substring(1);
                }else {
                    char last=raw.charAt(i-1);
                    if(last=='+'||last=='-'||last=='*'||last=='/'){
                        raw=raw.substring(0,i)+"#"+raw.substring(i+1);
                    }
                }
            }
        }
        return raw;
    }
}
