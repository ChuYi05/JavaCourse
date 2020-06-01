package Week8;

import edu.princeton.cs.algs4.StdDraw;

public class Exercise4 {
    public static void main(String[] args) {
        StdDraw.setScale(-1,1);
        double x=0;
        double r=0.1;
        while(true){
            StdDraw.clear();
            StdDraw.setPenColor(StdDraw.YELLOW);
            StdDraw.filledRectangle(0,0,1,0.5);
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.filledCircle(x-0.9,0.4*Math.sin(10*x),r);
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.filledCircle(x-0.9,0.9*Math.cos(10*x+Math.PI/3),r);
            StdDraw.show();
            StdDraw.pause(400);
            x+=0.05;
            if(x>1.8){
                x=0;
            }
        }
    }
}
