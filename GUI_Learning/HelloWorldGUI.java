package GUI_Learning;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

 public class HelloWorldGUI extends JFrame {
     public HelloWorldGUI() {
         setTitle("Hello World!");    //set a title for the window
         setSize(400, 200);    //set window size
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //set the wi ndow could be closed or not
         JLabel jl = new JLabel("This is my first GUI!");    //create a la bel
         Container c = getContentPane();    //get the window
         c.add(jl);    //add label to window
         setVisible(true);    //set the window is visible
     }
         public static void main(String[] agrs) {
         new HelloWorldGUI();
     }
 }

