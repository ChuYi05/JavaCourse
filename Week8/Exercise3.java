package Week8;

import edu.princeton.cs.algs4.StdDraw;

public class Exercise3 {
    public static void main(String[] args) {
        for(int i=0;i<16;i++){
            StdDraw.setPenColor(255-(255 / 15 * i),255-(255/15*i),255);
            for(int j=0;j<16;j++){
                StdDraw.filledSquare((2.*j+1)/32.,(2.*i+1)/32.,1./32.);
            }
        }
        for(int i=0;i<16;i++){
            StdDraw.setPenColor((255/15*i),(255/15*i),(255/15*i));
            for(int j=0;j<16;j++){
                StdDraw.filledSquare((2.*i+1)/32.,(2.*j+1)/32.,1./64.);
            }
        }
    }
}
