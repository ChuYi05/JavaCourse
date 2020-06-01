package Week3;

public class Lecture_SquareRoot {
    public static void main(String[] args) {
        int c = 5;
        int i = 0;
        float x=c;
        while (i < 4) {
            x = (x + c/x) / 2;
            i++;
        }
        System.out.println(x);
    }
}
