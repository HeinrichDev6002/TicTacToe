import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {
    boolean turn = true;
    Toe toe = new Toe();
    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    JButton button4 = new JButton("Button 4");
    JButton button5 = new JButton("Button 5");
    JButton button6 = new JButton("Button 6");
    JButton button7 = new JButton("Button 7");
    JButton button8 = new JButton("Button 8");
    JButton button9 = new JButton("Button 9");
    Window(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.cyan);
        this.setLayout(new GridLayout(3,3));



        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(button8);
        this.add(button9);
        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);
        button4.setFocusable(false);
        button5.setFocusable(false);
        button6.setFocusable(false);
        button7.setFocusable(false);
        button8.setFocusable(false);
        button9.setFocusable(false);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);

        while(toe.ganhou == false || toe.lose == false){
        toe.Win();
        this.setVisible(true);}

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (turn == true){
        if(e.getSource()==button1){
            button1.setEnabled(false);
            toe.a = 1;
            button1.setText("X");
            turn = false;
        }
        if(e.getSource()==button2){
            button2.setEnabled(false);
            toe.b = 1;
            button2.setText("X");
            turn = false;
        }
        if(e.getSource()==button3){
            button3.setEnabled(false);
            toe.c = 1;
            button3.setText("X");
            turn = false;
        }
        if(e.getSource()==button4){
            button4.setEnabled(false);
            toe.b = 1;
            button4.setText("X");
            turn = false;
        }
        if(e.getSource()==button5){
            button5.setEnabled(false);
            toe.c = 1;
            button5.setText("X");
            turn = false;
        }
        if(e.getSource()==button6){
            button6.setEnabled(false);
            toe.a = 1;
            button6.setText("X");
            turn = false;
        }

        if(e.getSource()==button7){
            button7.setEnabled(false);
            toe.c = 1;
            button7.setText("X");
            turn = false;
        }
        if(e.getSource()==button8){
            button8.setEnabled(false);
            toe.a = 1;
            button8.setText("X");
            turn = false;
        }
        if(e.getSource()==button9){
            button9.setEnabled(false);
            toe.b = 1;
            button9.setText("X");
            turn = false;
        }}
//        @Override
//        public void actionPerformed(ActionEvent e) {
            else if (turn == false){
                if(e.getSource()==button1){
                    button1.setEnabled(false);
                    toe.d = 1;
                    button1.setText("O");
                    turn = true;
                }
                if(e.getSource()==button2){
                    button2.setEnabled(false);
                    toe.e = 1;
                    button2.setText("O");
                    turn = true;
                }
                if(e.getSource()==button3){
                    button3.setEnabled(false);
                    toe.f = 1;
                    button3.setText("O");
                    turn = true;
                }
                if(e.getSource()==button4){
                    button4.setEnabled(false);
                    toe.e = 1;
                    button4.setText("O");
                    turn = true;
                }
                if(e.getSource()==button5){
                    button5.setEnabled(false);
                    toe.f = 1;
                    button5.setText("O");
                    turn = true;
                }
                if(e.getSource()==button6){
                    button6.setEnabled(false);
                    toe.d = 1;
                    button6.setText("O");
                    turn = true;
                }

                if(e.getSource()==button7){
                    button7.setEnabled(false);
                    toe.f = 1;
                    button7.setText("O");
                    turn = true;
                }
                if(e.getSource()==button8){
                    button8.setEnabled(false);
                    toe.d = 1;
                    button8.setText("O");
                    turn = true;
                }
                if(e.getSource()==button9){
                    button9.setEnabled(false);
                    toe.e = 1;
                    button9.setText("O");
                    turn = true;
                }}


        }
    }





