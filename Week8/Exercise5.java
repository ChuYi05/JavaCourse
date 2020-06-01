package Week8;

import edu.princeton.cs.algs4.Picture;
import java.awt.*;
import java.util.Random;

public class Exercise5 {
    public static void main(String[] args) {
        Picture pic=new Picture(args[0]);
        int h=pic.height();
        int w=pic.width();
        Picture target=new Picture(w,h);
        for(int col=0;col<w;col++){
            for(int row=0;row<h;row++){
                Random r=new Random();
                int a,b;
                do {
                    a =col+ r.nextInt(10) - 5;
                    b =row+ r.nextInt(10) - 5;
                }while(!(a>0&&a<w&&b>0&&b<h));
                    Color finalColor=pic.get(a,b);
                    target.set(col,row,finalColor);

            }
        }
        target.show();
    }
}
