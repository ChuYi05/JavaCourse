package Week3;

public class Lecture_Ruler {
    public static void main(String[] args){
        String ruler="";
        for(int i=1;i<=5;i++){
            ruler=ruler+i+ruler;
        }
        System.out.println(ruler);
    }
}
