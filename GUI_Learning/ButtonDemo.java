package GUI_Learning;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonDemo {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Button Demo");
        frame.setSize(400,200);
        JPanel jp=new JPanel();
        JButton btn1=new JButton("Regular Button");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });
        JButton btn2=new JButton("Disable Button");
        jp.add(btn1);
        btn2.setEnabled(false);
        jp.add(btn2);
        frame.add(jp);
        frame.setBounds(300,200,600,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
