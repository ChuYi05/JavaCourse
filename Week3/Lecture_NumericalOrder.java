package Week3;

public class Lecture_NumericalOrder {
    public static void main(String[] args){
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        int t,q;
        if(a>b){
            if(c>a){//c>a>b
                t=c;
                c=b;
                b=a;
                a=t;
            }
            else {
                if(b>c){//a>b>c
                }
                else {//a>c>b
                    t=c;
                    c=b;
                    b=t;
                }
            }
        }
        else {
            if(c>b){//c>b>a
                t=c;
                c=a;
                a=c;
            }
            else {
                if(c>a){//b>c>a
                    q=c;
                    c=a;
                    a=b;
                    b=q;
                }
                else {//b>a>c
                    t=b;
                    b=a;
                    a=b;
                }
            }
        }
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);


    }
}
