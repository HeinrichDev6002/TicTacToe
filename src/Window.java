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

    public Window(){
        addWindow();
    }


    public void addWindow(){
        frame = new JFrame();
        frame.setLayout(new GridLayout(3,3,5,5));
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Turn");
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

        if(e.getSource() == button[i][j]){
            button[i][j].setText("X");
            button[i][j].setFont(new Font("MV Boli",Font.PLAIN,25));
            button[i][j].setBackground(Color.red);
            button[i][j].setEnabled(false);
        }
    }}}
}
