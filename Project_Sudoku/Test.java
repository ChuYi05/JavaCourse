package Project_Sudoku;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class Test extends JFrame{
    static int 提示次数=0;

    //开始游戏
    public static void 初始化() throws AWTException {
        //创建窗口
        JFrame frame=new JFrame("Sudoku");
        frame.setLayout(null);
        frame.setSize(700,400);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);


        //初始化格子
        // //先创建Panel以方便确定每个大格子的位置
        JPanel jp格子=new JPanel();
        jp格子.setBounds(0,0,400,400);
        jp格子.setLayout(new GridLayout(3,3));
        // //画出大格子
        JPanel[] bigGrids=new JPanel[9];
        for(int i=0;i<9;i++){
            bigGrids[i]=new JPanel();
            bigGrids[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            bigGrids[i].setLayout(new GridLayout(3,3));
            jp格子.add(bigGrids[i]);
        }
        // //在每一个大格子里面创建9个输入框
        JLabel[][][] smallGrids=new JLabel[9][3][3];
        for(int z=0;z<9;z++){//创建的时候由于gridlayout的关系，就是按照宫、行、列的形式来创建smallGrids的
            for(int x=0;x<3;x++){
                for(int y=0;y<3;y++){
                    smallGrids[z][x][y]=new JLabel();
                    smallGrids[z][x][y].setBorder(BorderFactory.createEtchedBorder());
                    smallGrids[z][x][y].setHorizontalAlignment((JLabel.CENTER));
                    smallGrids[z][x][y].setFont(new Font("标准字体",Font.ITALIC,20));
                    bigGrids[z].add(smallGrids[z][x][y]);
                }
            }
        }



        //画出输入数字的按钮（隐藏）
        JButton[][][] smallGrids1=new JButton[9][3][3];
        for(int z=0;z<9;z++){//z是宫，是从左往右，从上往下；x是行；y是列
            for(int x=0;x<3;x++){
                for(int y=0;y<3;y++){
                    smallGrids1[z][x][y]=new JButton();
                    if(z<3) {
                        smallGrids1[z][x][y].setBounds(400/3*z+400/9*y,400/9*x,400/9,400/9);
                    }
                    if(z>2&&z<6) {
                        smallGrids1[z][x][y].setBounds(400/3*(z-3)+400/9*y,400/9*x+400/3,400/9,400/9);
                    }
                    if(z>5) {
                        smallGrids1[z][x][y].setBounds(400/3*(z-6)+400/9*y,400/9*x+800/3,400/9,400/9);
                    }
                    smallGrids1[z][x][y].setMargin(new Insets(0,0,0,0));//将边框外的上下左右空间设置为0
                    smallGrids1[z][x][y].setIconTextGap(0);//将标签中显示的文本和图标之间的间隔量设置为0
                    smallGrids1[z][x][y].setBorderPainted(false);//不打印边框
                    smallGrids1[z][x][y].setBorder(null);//除去边框
                    smallGrids1[z][x][y].setContentAreaFilled(false);//除去默认的背景填充

                }
            }
        }


        //初始化Timer界面
        Timers t=new Timers(500,175,100,25,frame);


        //创建答案数组以储存答案
        int[][][] 答案=new int[9][3][3];

        // // //第一宫
        smallGrids1[0][0][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(0,0,0,smallGrids,t,答案);
            }
        });
        smallGrids1[0][0][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(0,0,1,smallGrids,t,答案);
            }
        });
        smallGrids1[0][0][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(0,0,2,smallGrids,t,答案);
            }
        });
        smallGrids1[0][1][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(0,1,0,smallGrids,t,答案);
            }
        });
        smallGrids1[0][1][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(0,1,1,smallGrids,t,答案);
            }
        });
        smallGrids1[0][1][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(0,1,2,smallGrids,t,答案);
            }
        });
        smallGrids1[0][2][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(0,2,0,smallGrids,t,答案);
            }
        });
        smallGrids1[0][2][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(0,2,1,smallGrids,t,答案);
            }
        });
        smallGrids1[0][2][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(0,2,2,smallGrids,t,答案);
            }
        });

        // // //第二宫
        smallGrids1[1][0][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(1,0,0,smallGrids,t,答案);
            }
        });
        smallGrids1[1][0][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(1,0,1,smallGrids,t,答案);
            }
        });
        smallGrids1[1][0][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(1,0,2,smallGrids,t,答案);
            }
        });
        smallGrids1[1][1][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(1,1,0,smallGrids,t,答案);
            }
        });
        smallGrids1[1][1][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(1,1,1,smallGrids,t,答案);
            }
        });
        smallGrids1[1][1][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(1,1,2,smallGrids,t,答案);
            }
        });
        smallGrids1[1][2][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(1,2,0,smallGrids,t,答案);
            }
        });
        smallGrids1[1][2][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(1,2,1,smallGrids,t,答案);
            }
        });
        smallGrids1[1][2][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(1,2,2,smallGrids,t,答案);
            }
        });

        // // //第三宫
        smallGrids1[2][0][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(2,0,0,smallGrids,t,答案);
            }
        });
        smallGrids1[2][0][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(2,0,1,smallGrids,t,答案);
            }
        });
        smallGrids1[2][0][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(2,0,2,smallGrids,t,答案);
            }
        });
        smallGrids1[2][1][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(2,1,0,smallGrids,t,答案);
            }
        });
        smallGrids1[2][1][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(2,1,1,smallGrids,t,答案);
            }
        });
        smallGrids1[2][1][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(2,1,2,smallGrids,t,答案);
            }
        });
        smallGrids1[2][2][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(2,2,0,smallGrids,t,答案);
            }
        });
        smallGrids1[2][2][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(2,2,1,smallGrids,t,答案);
            }
        });
        smallGrids1[2][2][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(2,2,2,smallGrids,t,答案);
            }
        });

        // // //第四宫
        smallGrids1[3][0][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(3,0,0,smallGrids,t,答案);
            }
        });
        smallGrids1[3][0][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(3,0,1,smallGrids,t,答案);
            }
        });
        smallGrids1[3][0][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(3,0,2,smallGrids,t,答案);
            }
        });
        smallGrids1[3][1][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(3,1,0,smallGrids,t,答案);
            }
        });
        smallGrids1[3][1][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(3,1,1,smallGrids,t,答案);
            }
        });
        smallGrids1[3][1][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(3,1,2,smallGrids,t,答案);
            }
        });
        smallGrids1[3][2][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(3,2,0,smallGrids,t,答案);
            }
        });
        smallGrids1[3][2][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(3,2,1,smallGrids,t,答案);
            }
        });
        smallGrids1[3][2][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(3,2,2,smallGrids,t,答案);
            }
        });

        // // //第五宫
        smallGrids1[4][0][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(4,0,0,smallGrids,t,答案);
            }
        });
        smallGrids1[4][0][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(4,0,1,smallGrids,t,答案);
            }
        });
        smallGrids1[4][0][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(4,0,2,smallGrids,t,答案);
            }
        });
        smallGrids1[4][1][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(4,1,0,smallGrids,t,答案);
            }
        });
        smallGrids1[4][1][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(4,1,1,smallGrids,t,答案);
            }
        });
        smallGrids1[4][1][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(4,1,2,smallGrids,t,答案);
            }
        });
        smallGrids1[4][2][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(4,2,0,smallGrids,t,答案);
            }
        });
        smallGrids1[4][2][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(4,2,1,smallGrids,t,答案);
            }
        });
        smallGrids1[4][2][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(4,2,2,smallGrids,t,答案);
            }
        });

        // // //第六宫
        smallGrids1[5][0][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(5,0,0,smallGrids,t,答案);
            }
        });
        smallGrids1[5][0][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(5,0,1,smallGrids,t,答案);
            }
        });
        smallGrids1[5][0][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(5,0,2,smallGrids,t,答案);
            }
        });
        smallGrids1[5][1][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(5,1,0,smallGrids,t,答案);
            }
        });
        smallGrids1[5][1][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(5,1,1,smallGrids,t,答案);
            }
        });
        smallGrids1[5][1][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(5,1,2,smallGrids,t,答案);
            }
        });
        smallGrids1[5][2][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(5,2,0,smallGrids,t,答案);
            }
        });
        smallGrids1[5][2][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(5,2,1,smallGrids,t,答案);
            }
        });
        smallGrids1[5][2][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(5,2,2,smallGrids,t,答案);
            }
        });

        // // //第七宫
        smallGrids1[6][0][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(6,0,0,smallGrids,t,答案);
            }
        });
        smallGrids1[6][0][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(6,0,1,smallGrids,t,答案);
            }
        });
        smallGrids1[6][0][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(6,0,2,smallGrids,t,答案);
            }
        });
        smallGrids1[6][1][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(6,1,0,smallGrids,t,答案);
            }
        });
        smallGrids1[6][1][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(6,1,1,smallGrids,t,答案);
            }
        });
        smallGrids1[6][1][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(6,1,2,smallGrids,t,答案);
            }
        });
        smallGrids1[6][2][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(6,2,0,smallGrids,t,答案);
            }
        });
        smallGrids1[6][2][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(6,2,1,smallGrids,t,答案);
            }
        });
        smallGrids1[6][2][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(6,2,2,smallGrids,t,答案);
            }
        });

        // // //第八宫
        smallGrids1[7][0][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(7,0,0,smallGrids,t,答案);
            }
        });
        smallGrids1[7][0][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(7,0,1,smallGrids,t,答案);
            }
        });
        smallGrids1[7][0][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(7,0,2,smallGrids,t,答案);
            }
        });
        smallGrids1[7][1][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(7,1,0,smallGrids,t,答案);
            }
        });
        smallGrids1[7][1][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(7,1,1,smallGrids,t,答案);
            }
        });
        smallGrids1[7][1][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(7,1,2,smallGrids,t,答案);
            }
        });
        smallGrids1[7][2][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(7,2,0,smallGrids,t,答案);
            }
        });
        smallGrids1[7][2][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(7,2,1,smallGrids,t,答案);
            }
        });
        smallGrids1[7][2][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(7,2,2,smallGrids,t,答案);
            }
        });

        // // //第九宫
        smallGrids1[8][0][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(8,0,0,smallGrids,t,答案);
            }
        });
        smallGrids1[8][0][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(8,0,1,smallGrids,t,答案);
            }
        });
        smallGrids1[8][0][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(8,0,2,smallGrids,t,答案);
            }
        });
        smallGrids1[8][1][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(8,1,0,smallGrids,t,答案);
            }
        });
        smallGrids1[8][1][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(8,1,1,smallGrids,t,答案);
            }
        });
        smallGrids1[8][1][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(8,1,2,smallGrids,t,答案);
            }
        });
        smallGrids1[8][2][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(8,2,0,smallGrids,t,答案);
            }
        });
        smallGrids1[8][2][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(8,2,1,smallGrids,t,答案);
            }
        });
        smallGrids1[8][2][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                输入数字(8,2,2,smallGrids,t,答案);
            }
        });


        //初始化新游戏按钮
        JButton 新游戏=new JButton("新游戏");
        新游戏.setBounds(425,25,250,50);
        新游戏.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                选择难度(smallGrids,t,答案);
            }
        });


        //初始化读取存档按钮
        JButton 读取存档=new JButton("读取存档");
        读取存档.setBounds(425,100,250,50);
        读取存档.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file=new File("C:\\Users\\ChuYi\\Documents\\IDEA_Workspace\\Basis of Programming Development\\src\\Project_Sudoku/进度.txt");
                try {
                    Scanner input=new Scanner(file);
                    for(int z=0;z<9;z++){
                        for(int x=0;x<3;x++){
                            for(int y=0;y<3;y++){
                                smallGrids[z][x][y].setText("");
                            }
                        }
                    }//每次读取存档之前都需要先清零
                    String all=input.nextLine();
                    String[] numbers=all.split("");
                    int s=0;
                    for(int i=0;i<9;i++){
                        for(int j=0;j<3;j++){
                            for(int k=0;k<3;k++){
                                if(!numbers[s].equals(" ")){
                                    smallGrids[i][j][k].setText(numbers[s]);
                                    s+=2;
                                }else{
                                    s++;
                                }
                            }
                        }
                    }//注意这里用Scanner读带有效空格的处理方法
                    t.reset();
                    t.open();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });


        //把panel加入到窗口并且显示（Timer不需要加)
        frame.add(jp格子);
        frame.add(新游戏);
        frame.add(读取存档);
        for(int z=0;z<9;z++){
            for(int x=0;x<3;x++){
                for(int y=0;y<3;y++){
                    frame.add(smallGrids1[z][x][y]);
                }
            }
        }
        frame.setVisible(true);
    }


    // //数字输入
    public static void 输入数字(int 宫,int 行,int 列,JLabel[][][] smallGrids,Timers t,int[][][] 答案) {
        JFrame frame1=new JFrame("选择数字");
        frame1.setSize(300,400);
        JPanel jp=new JPanel();
        GridLayout layout=new GridLayout(4,3);
        jp.setLayout(layout);
        //创建选择数字窗口
        JButton num1=new JButton("1");
        JButton num2=new JButton("2");
        JButton num3=new JButton("3");
        JButton num4=new JButton("4");
        JButton num5=new JButton("5");
        JButton num6=new JButton("6");
        JButton num7=new JButton("7");
        JButton num8=new JButton("8");
        JButton num9=new JButton("9");
        JButton undo=new JButton("undo");
        JButton hint=new JButton("hint");


        //画出九个数字按钮，实现的功能有：填写数字；判断是否违规；记录进度
        num1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object obj=e.getSource();
                if(obj==num1) {
                    smallGrids[宫][行][列].setText(num1.getText());
                    if(违规(num1,宫,行,列,smallGrids)){
                        JFrame frame2=new JFrame("违反规则！");
                        frame2.setBounds(0,0,300,300);
                        frame2.setLayout(null);
                        JButton 重写=new JButton("重写");
                        重写.setBounds(100,100,100,50);
                        重写.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                smallGrids[宫][行][列].setText("");
                                frame2.dispose();
                            }
                        });
                        frame2.add(重写);
                        frame2.setVisible(true);
                    }else {
                        File 进度=new File("C:\\Users\\ChuYi\\Documents\\IDEA_Workspace\\Basis of Programming Development\\src\\Project_Sudoku/进度.txt");
                        进度.delete();//清空之前的内容
                        try {
                            FileWriter writer=new FileWriter(进度,true);
                            for(int i=0;i<9;i++){
                                for(int j=0;j<3;j++){
                                    for(int k=0;k<3;k++){
                                        writer.write(smallGrids[i][j][k].getText()+" ");
                                    }
                                }
                            }
                            writer.close();
                            if(填满()){
                                t.close();
                            }
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
                frame1.dispose();
            }
        });
        num2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object obj=e.getSource();
                if(obj==num2) {
                    smallGrids[宫][行][列].setText(num2.getText());
                    if(违规(num2,宫,行,列,smallGrids)){
                        JFrame frame2=new JFrame("违反规则！");
                        frame2.setBounds(0,0,300,300);
                        frame2.setLayout(null);
                        JButton 重写=new JButton("重写");
                        重写.setBounds(100,100,100,50);
                        重写.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                smallGrids[宫][行][列].setText("");
                                frame2.dispose();
                            }
                        });
                        frame2.add(重写);
                        frame2.setVisible(true);
                    }else {
                        File 进度=new File("C:\\Users\\ChuYi\\Documents\\IDEA_Workspace\\Basis of Programming Development\\src\\Project_Sudoku/进度.txt");
                        进度.delete();//清空之前的内容
                        try {
                            FileWriter writer=new FileWriter(进度,true);
                            for(int i=0;i<9;i++){
                                for(int j=0;j<3;j++){
                                    for(int k=0;k<3;k++){
                                        writer.write(smallGrids[i][j][k].getText()+" ");
                                    }
                                }
                            }
                            writer.flush();//覆盖之前写的内容
                            writer.close();
                            if(填满()) {
                                t.close();
                            }
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }

                    }
                }
                frame1.dispose();
            }
        });
        num3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object obj=e.getSource();
                if(obj==num3) {
                    smallGrids[宫][行][列].setText(num3.getText());
                    if(违规(num3,宫,行,列,smallGrids)){
                        JFrame frame2=new JFrame("违反规则！");
                        frame2.setBounds(0,0,300,300);
                        frame2.setLayout(null);
                        JButton 重写=new JButton("重写");
                        重写.setBounds(100,100,100,50);
                        重写.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                smallGrids[宫][行][列].setText("");
                                frame2.dispose();
                            }
                        });
                        frame2.add(重写);
                        frame2.setVisible(true);
                    }else {
                        File 进度=new File("C:\\Users\\ChuYi\\Documents\\IDEA_Workspace\\Basis of Programming Development\\src\\Project_Sudoku/进度.txt");
                        进度.delete();//清空之前的内容
                        try {
                            FileWriter writer=new FileWriter(进度,true);
                            for(int i=0;i<9;i++){
                                for(int j=0;j<3;j++){
                                    for(int k=0;k<3;k++){
                                        writer.write(smallGrids[i][j][k].getText()+" ");
                                    }
                                }
                            }
                            writer.flush();//覆盖之前写的内容
                            writer.close();
                            if(填满()){
                                t.close();
                            }
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }

                    }
                }
                frame1.dispose();
            }
        });
        num4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object obj=e.getSource();
                if(obj==num4) {
                    smallGrids[宫][行][列].setText(num4.getText());
                    if(违规(num4,宫,行,列,smallGrids)){
                        JFrame frame2=new JFrame("违反规则！");
                        frame2.setBounds(0,0,300,300);
                        frame2.setLayout(null);
                        JButton 重写=new JButton("重写");
                        重写.setBounds(100,100,100,50);
                        重写.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                smallGrids[宫][行][列].setText("");
                                frame2.dispose();
                            }
                        });
                        frame2.add(重写);
                        frame2.setVisible(true);
                    }else {
                        File 进度=new File("C:\\Users\\ChuYi\\Documents\\IDEA_Workspace\\Basis of Programming Development\\src\\Project_Sudoku/进度.txt");
                        进度.delete();//清空之前的内容
                        try {
                            FileWriter writer=new FileWriter(进度,true);
                            for(int i=0;i<9;i++){
                                for(int j=0;j<3;j++){
                                    for(int k=0;k<3;k++){
                                        writer.write(smallGrids[i][j][k].getText()+" ");
                                    }
                                }
                            }
                            writer.flush();//覆盖之前写的内容
                            writer.close();
                            if(填满()){
                                t.close();
                            }
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }

                    }
                }
                frame1.dispose();
            }
        });
        num5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object obj=e.getSource();
                if(obj==num5) {
                    smallGrids[宫][行][列].setText(num5.getText());
                    if(违规(num5,宫,行,列,smallGrids)){
                        JFrame frame2=new JFrame("违反规则！");
                        frame2.setBounds(0,0,300,300);
                        frame2.setLayout(null);
                        JButton 重写=new JButton("重写");
                        重写.setBounds(100,100,100,50);
                        重写.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                smallGrids[宫][行][列].setText("");
                                frame2.dispose();
                            }
                        });
                        frame2.add(重写);
                        frame2.setVisible(true);
                    }else {
                        File 进度=new File("C:\\Users\\ChuYi\\Documents\\IDEA_Workspace\\Basis of Programming Development\\src\\Project_Sudoku/进度.txt");
                        进度.delete();//清空之前的内容
                        try {
                            FileWriter writer=new FileWriter(进度,true);
                            for(int i=0;i<9;i++){
                                for(int j=0;j<3;j++){
                                    for(int k=0;k<3;k++){
                                        writer.write(smallGrids[i][j][k].getText()+" ");
                                    }
                                }
                            }
                            writer.flush();//覆盖之前写的内容
                            writer.close();
                            if(填满()){
                                t.close();
                            }
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }

                    }
                }
                frame1.dispose();
            }
        });
        num6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object obj=e.getSource();
                if(obj==num6) {
                    smallGrids[宫][行][列].setText(num6.getText());
                    if(违规(num6,宫,行,列,smallGrids)){
                        JFrame frame2=new JFrame("违反规则！");
                        frame2.setBounds(0,0,300,300);
                        frame2.setLayout(null);
                        JButton 重写=new JButton("重写");
                        重写.setBounds(100,100,100,50);
                        重写.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                smallGrids[宫][行][列].setText("");
                                frame2.dispose();
                            }
                        });
                        frame2.add(重写);
                        frame2.setVisible(true);
                    }else {
                        File 进度=new File("C:\\Users\\ChuYi\\Documents\\IDEA_Workspace\\Basis of Programming Development\\src\\Project_Sudoku/进度.txt");
                        进度.delete();//清空之前的内容
                        try {
                            FileWriter writer=new FileWriter(进度,true);
                            for(int i=0;i<9;i++){
                                for(int j=0;j<3;j++){
                                    for(int k=0;k<3;k++){
                                        writer.write(smallGrids[i][j][k].getText()+" ");
                                    }
                                }
                            }
                            writer.flush();//覆盖之前写的内容
                            writer.close();
                            if(填满()){
                                t.close();
                            }
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
                frame1.dispose();
            }
        });
        num7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object obj=e.getSource();
                if(obj==num7) {
                    smallGrids[宫][行][列].setText(num7.getText());
                    if(违规(num7,宫,行,列,smallGrids)){
                        JFrame frame2=new JFrame("违反规则！");
                        frame2.setBounds(0,0,300,300);
                        frame2.setLayout(null);
                        JButton 重写=new JButton("重写");
                        重写.setBounds(100,100,100,50);
                        重写.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                smallGrids[宫][行][列].setText("");
                                frame2.dispose();
                            }
                        });
                        frame2.add(重写);
                        frame2.setVisible(true);
                    }else {
                        File 进度=new File("C:\\Users\\ChuYi\\Documents\\IDEA_Workspace\\Basis of Programming Development\\src\\Project_Sudoku/进度.txt");
                        进度.delete();//清空之前的内容
                        try {
                            FileWriter writer=new FileWriter(进度,true);
                            for(int i=0;i<9;i++){
                                for(int j=0;j<3;j++){
                                    for(int k=0;k<3;k++){
                                        writer.write(smallGrids[i][j][k].getText()+" ");
                                    }
                                }
                            }
                            writer.flush();//覆盖之前写的内容
                            writer.close();
                            if(填满()){
                                t.close();
                            }
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }

                    }
                }
                frame1.dispose();
            }
        });
        num8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object obj=e.getSource();
                if(obj==num8) {
                    smallGrids[宫][行][列].setText(num8.getText());
                    if(违规(num8,宫,行,列,smallGrids)){
                        JFrame frame2=new JFrame("违反规则！");
                        frame2.setBounds(0,0,300,300);
                        frame2.setLayout(null);
                        JButton 重写=new JButton("重写");
                        重写.setBounds(100,100,100,50);
                        重写.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                smallGrids[宫][行][列].setText("");
                                frame2.dispose();
                            }
                        });
                        frame2.add(重写);
                        frame2.setVisible(true);
                    }else {
                        File 进度=new File("C:\\Users\\ChuYi\\Documents\\IDEA_Workspace\\Basis of Programming Development\\src\\Project_Sudoku/进度.txt");
                        进度.delete();//清空之前的内容
                        try {
                            FileWriter writer=new FileWriter(进度,true);
                            for(int i=0;i<9;i++){
                                for(int j=0;j<3;j++){
                                    for(int k=0;k<3;k++){
                                        writer.write(smallGrids[i][j][k].getText()+" ");
                                    }
                                }
                            }
                            writer.flush();//覆盖之前写的内容
                            writer.close();
                            if(填满()){
                                t.close();
                            }
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }

                    }
                }
                frame1.dispose();
            }
        });
        num9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object obj=e.getSource();
                if(obj==num9) {
                    smallGrids[宫][行][列].setText(num9.getText());
                    if(违规(num9,宫,行,列,smallGrids)){
                        JFrame frame2=new JFrame("违反规则！");
                        frame2.setBounds(0,0,300,300);
                        frame2.setLayout(null);
                        JButton 重写=new JButton("重写");
                        重写.setBounds(100,100,100,50);
                        重写.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                smallGrids[宫][行][列].setText("");
                                frame2.dispose();
                            }
                        });
                        frame2.add(重写);
                        frame2.setVisible(true);
                    }else {
                        File 进度=new File("C:\\Users\\ChuYi\\Documents\\IDEA_Workspace\\Basis of Programming Development\\src\\Project_Sudoku/进度.txt");
                        进度.delete();//清空之前的内容
                        try {
                            FileWriter writer=new FileWriter(进度,true);
                            for(int i=0;i<9;i++){
                                for(int j=0;j<3;j++){
                                    for(int k=0;k<3;k++){
                                        writer.write(smallGrids[i][j][k].getText()+" ");
                                    }
                                }
                            }
                            writer.flush();//覆盖之前写的内容
                            writer.close();
                            if(填满()){
                                t.close();
                            }
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }

                    }
                }
                frame1.dispose();
            }
        });
        undo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                smallGrids[宫][行][列].setText("");
                frame1.dispose();
            }
        });
        hint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(提示次数<=5) {
                    smallGrids[宫][行][列].setText(String.valueOf(答案[宫][行][列]));
                    frame1.dispose();
                    提示次数++;
                }else{
                    JOptionPane.showMessageDialog(
                            null,
                            "提示次数超过上限！",
                            "错误！",
                            JOptionPane.WARNING_MESSAGE
                    );
                }//注意这里showMessage弹出临时窗口的方法
            }
        });
        jp.add(num1);
        jp.add(num2);
        jp.add(num3);
        jp.add(num4);
        jp.add(num5);
        jp.add(num6);
        jp.add(num7);
        jp.add(num8);
        jp.add(num9);
        jp.add(undo);
        jp.add(hint);
        frame1.add(jp);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    //违规判定
    public static boolean 违规(JButton num,int 宫,int 行,int 列,JLabel[][][] smallGrids){
        String 选项=num.getText();
        //行判定
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                if (选项.equals(smallGrids[(宫 / 3)*3 + i][行][j].getText())) {
                    if (!((宫 / 3)*3 + i == 宫&& 列 == j)){
                        return true;//只要有任何一个已存在的数和选项一样，直接停止检查，直接return
                    }
                }
            }
        }
        //列判定
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                if (选项.equals(smallGrids[宫 % 3 + 3*i][j][列].getText())) {
                    if (!(宫 % 3 + 3 * i == 宫 && 行 == j)) {
                        return true;//列相等
                    }
                }
            }
        }
        //宫判定
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                if(! (选项.equals(smallGrids[宫][i][j].getText()))) {
                    if (i == 行 && j == 列) {
                        return true;//宫相等
                    }
                }
            }
        }
        return false;
    }


    //结束判定
    public static boolean 填满() throws FileNotFoundException {
        File file=new File("C:\\Users\\ChuYi\\Documents\\IDEA_Workspace\\Basis of Programming Development\\src\\Project_Sudoku/进度.txt");
        Scanner input=new Scanner(file);
        int a=0;
        while(input.hasNext()){
            input.next();
            a++;
        }
        input.close();
        if(a==81){return true;}
        else {return false;}
    }


    //选择难度，并且创建题目，并且开始计时，并且返回答案数组
    public static int[][][] 选择难度(JLabel[][][] smallGrids,Timers t,int[][][] 答案){
        //创建题号和难度变量
        final String[] 难度 = new String[1];

        //创建选择难度窗口
        JFrame frame=new JFrame("选择难度");
        frame.setSize(700,450);
        JPanel jp=new JPanel();
        jp.setLayout(null);
        JButton btn1=new JButton("简单");
        JButton btn2=new JButton("中等");
        JButton btn3=new JButton("困难");
        btn1.setBounds(200,25,300,100);
        btn2.setBounds(200,150,300,100);
        btn3.setBounds(200,275,300,100);


        //选择难度之后的动作：随机将一个题目写入到格子中去
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("你已选择简单难度！");
                try {
                    int[][][] 题目=从题库中读题("简单",答案);
                    for(int z=0;z<9;z++){
                        for(int x=0;x<3;x++){
                            for(int y=0;y<3;y++){
                                    smallGrids[z][x][y].setText("");
                            }
                        }
                    }//每次选择难度都需要先清零
                    for(int z=0;z<9;z++){
                        for(int x=0;x<3;x++){
                            for(int y=0;y<3;y++){
                                if(题目[z][x][y]!=0) {
                                    smallGrids[z][x][y].setText(题目[z][x][y] + "");//虽然数组是int，但是setText转化成了String
                                }
                            }
                        }
                    }
                    t.reset();
                    t.open();
                    frame.dispose();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("你已选择中等难度！");
                try {
                    int[][][] 题目=从题库中读题("中等",答案);
                    for(int z=0;z<9;z++){
                        for(int x=0;x<3;x++){
                            for(int y=0;y<3;y++){
                                    smallGrids[z][x][y].setText("");
                            }
                        }
                    }//每次选择难度都需要先清零
                    for(int z=0;z<9;z++){
                        for(int x=0;x<3;x++){
                            for(int y=0;y<3;y++){
                                if(从题库中读题("中等",答案)[z][x][y]!=0) {
                                    smallGrids[z][x][y].setText(题目[z][x][y] + "");//虽然数组是int，但是setText转化成了String
                                }
                            }
                        }
                    }
                    t.reset();
                    t.open();
                    frame.dispose();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("你已选择困难难度！");
                try {
                    int[][][] 题目=从题库中读题("困难",答案);
                    for(int z=0;z<9;z++){
                        for(int x=0;x<3;x++){
                            for(int y=0;y<3;y++){
                                    smallGrids[z][x][y].setText("");
                            }
                        }
                    }//每次选择难度都需要先清零
                    for(int z=0;z<9;z++){
                        for(int x=0;x<3;x++){
                            for(int y=0;y<3;y++){
                                if(从题库中读题("困难",答案)[z][x][y]!=0) {
                                    smallGrids[z][x][y].setText(题目[z][x][y] + "");//虽然数组是int，但是setText转化成了String
                                }
                            }
                        }
                    }
                    t.reset();
                    t.open();
                    frame.dispose();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });
        jp.add(btn1);
        jp.add(btn2);
        jp.add(btn3);
        frame.add(jp);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        return 答案;
    }


    //从题库中读取题目，并且把题目和答案存储在 int[][][]题目 和 int[][][]答案 里（题目中空缺的格子用0表示）
    public static int[][][] 从题库中读题(String 难度,int[][][] 答案) throws FileNotFoundException {
        //创建 int[][][]题目
        int[][][] 题目=new int[9][3][3];

        //使用Scanner读取题库
        File file=new File("C:\\Users\\ChuYi\\Documents\\IDEA_Workspace\\Basis of Programming Development\\src\\Project_Sudoku\\"+难度+".txt");
        Scanner input=new Scanner(file);

        //随机选择一个题号
        Random r=new Random();
        int 题号=0;

        //跳过前面的题目
        for(int i=0;i<2*(题号-1);i++){
            input.nextLine();
            for(int j=0;j<27;j++){
                input.nextLine();
            }
        }

        //将对应的答案储存在 int[][][]答案 里
        input.nextLine();
        for(int z=0;z<9;z++){
            for(int x=0;x<3;x++){
                for(int y=0;y<3;y++){
                    答案[z][x][y]=input.nextInt();
                }
            }
        }

        //将选中的题目储存在 int[][][]题目 里
        input.nextLine();
        input.nextLine();//由于之前一直是nextInt，所以需要再多加一个nextLine()
        for(int z=0;z<9;z++){
            for(int x=0;x<3;x++){
                for(int y=0;y<3;y++){
                    题目[z][x][y]=input.nextInt();
                }
            }
        }

        return 题目;
    }


    public static void main(String[] args) throws FileNotFoundException, AWTException {
        初始化();
    }
}
