package Project_Sudoku;


import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;


@SuppressWarnings("all")
public class Timers extends JFrame {
    final Label lab = new Label();
    Date xianzai = new Date();
    final Timer timer;

    public Timers(int x,int y,int width,int length,JFrame frame){
        SimpleDateFormat d1 = new SimpleDateFormat("HH:mm:ss");
        xianzai.setHours(0);
        xianzai.setMinutes(0);
        xianzai.setSeconds(0);

        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Date xianzai2 = new Date(xianzai.getTime() + 1000);
                xianzai = xianzai2;
                SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
                lab.setText(formatter.format(xianzai));
            }
        });

        lab.setText(d1.format(xianzai));
        lab.setBounds(x,y,width,length);
        frame.add(lab);
    }

    public void open(){
        timer.start();
    }

    public void close() {
        timer.stop();
        SimpleDateFormat d2 = new SimpleDateFormat("HH:mm:ss");

        String path = "C:\\Users\\ChuYi\\Documents\\IDEA_Workspace\\Basis of Programming Development\\src\\Project_Sudoku/record.txt";

        try {

            //保存之前，先比较是否创造纪录
            boolean flag = isCreateRecord(path, lab.getText());



            if (flag) {
                showMessage("创造纪录！！！");
            }else showMessage("获胜！！！");

            //将内容写入文本
            writeContent(path, lab.getText());

        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
    }


    //比较是否创造纪录
    public static boolean isCreateRecord(String path, String time) throws IOException, ParseException {

        File file =new File(path);

        SimpleDateFormat d2 = new SimpleDateFormat("HH:mm:ss");

        Date currentDate = d2.parse(time);

        if (!file.exists()) {
            file.createNewFile();
        }

        FileReader fr = new FileReader(path);
        BufferedReader bf = new BufferedReader(fr);
        String str;
        while ((str = bf.readLine()) != null) {
            Date oldDate = d2.parse(str);
            if(currentDate.getTime()>= oldDate.getTime()) {
                return false;
            }
        }

        return true;
    }

    // 将内容写入指定文件中
    public static void writeContent(String path, String content) throws IOException {

        File file = new File(path);

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter writer = new FileWriter(path, true);

        writer.write(content + System.getProperty("line.separator"));

        writer.close();
    }

    //提示信息窗口
    public static void showMessage(String message) {
        JOptionPane.showMessageDialog(
                null,
                message,
                "消息提醒",
                JOptionPane.WARNING_MESSAGE
        );
    }

    public void reset(){
        SimpleDateFormat d1 = new SimpleDateFormat("HH:mm:ss");
        xianzai.setHours(0);
        xianzai.setMinutes(0);
        xianzai.setSeconds(0);
        lab.setText(d1.format(xianzai));
    }
}