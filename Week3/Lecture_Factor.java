package Week3;

public class Lecture_Factor {
    public static void main(String[] args){
        Double n=Double.parseDouble(args[0]);
        int i=2;
        while(i<=n/i){
            while(n%i==0){
                System.out.println(i+"");
                n=n/i;
            }
            i++;
        }
    }
}
