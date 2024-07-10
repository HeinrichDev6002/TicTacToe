import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window implements ActionListener {
    JFrame frame;
    JButton[][] button = new JButton[3][3];
    JPanel panel;
    JLabel label;
    int i,j;
    boolean playerTurn = true;
    boolean win, lose = false;
    Buttons buttons = new Buttons();

    public Window(){
        addWindow();
    }


    public void addWindow(){
        frame = new JFrame();
        frame.setLayout(new GridLayout(3,3,5,5));
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Tic Tac Toe");
for(i = 0; i < 3; i++){
    for(j = 0; j < 3; j++) {
        button[i][j] = new JButton();
        button[i][j].addActionListener(this);
        frame.add(button[i][j]);


  }}

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(i = 0; i < 3; i++){
        for(j = 0; j < 3; j++){
if(playerTurn == true){

        if(e.getSource() == button[i][j]){
            button[i][j].setText("X");
            button[i][j].setFont(new Font("MV Boli",Font.PLAIN,25));
            button[i][j].setBackground(Color.red);
            button[i][j].setEnabled(false);
            buttons.winOrLose(button, playerTurn, frame);
            playerTurn = false;
        }
   } else if(playerTurn == false){
    if(e.getSource() == button[i][j]){
        button[i][j].setText("O");
       button[i][j].setFont(new Font("MV Boli",Font.PLAIN,25));
       button[i][j].setBackground(Color.cyan);
       button[i][j].setEnabled(false);
        buttons.winOrLose(button, playerTurn, frame);
        playerTurn = true;

   }

   }
        }
        }}
}
