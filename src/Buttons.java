import javax.swing.*;

public class Buttons {
    Buttons() {


    }
    String xOrcicle;
    public void winOrLose(JButton[][] b, boolean turn, JFrame f) {

        if (turn == true) {
            xOrcicle = "X";
        }
        if (turn == false){
            xOrcicle = "O";}
            if (b[0][0].getText().equals(xOrcicle) && b[0][1].getText().equals(xOrcicle) && b[0][2].getText()
                    .equals(xOrcicle)) {
                announceWinner(xOrcicle, f);
                System.out.println("Exito");
            }
        if (b[1][0].getText().equals(xOrcicle) && b[1][1].getText().equals(xOrcicle) && b[1][2].getText()
                .equals(xOrcicle)) {
            announceWinner(xOrcicle, f);
            System.out.println("Exito");
        }
        if (b[2][0].getText().equals(xOrcicle) && b[2][1].getText().equals(xOrcicle) && b[2][2].getText()
                .equals(xOrcicle)) {
            announceWinner(xOrcicle, f);
            System.out.println("Exito");
        }
        if (b[0][0].getText().equals(xOrcicle) && b[1][0].getText().equals(xOrcicle) && b[2][0].getText()
                .equals(xOrcicle)) {
            announceWinner(xOrcicle, f);
            System.out.println("Exito");
        }
        if (b[0][1].getText().equals(xOrcicle) && b[1][1].getText().equals(xOrcicle) && b[2][1].getText()
                .equals(xOrcicle)) {
            announceWinner(xOrcicle, f);
            System.out.println("Exito");
        }
        if (b[0][2].getText().equals(xOrcicle) && b[1][2].getText().equals(xOrcicle) && b[2][2].getText()
                .equals(xOrcicle)) {
            announceWinner(xOrcicle, f);
            System.out.println("Exito");
        }
        if (b[0][0].getText().equals(xOrcicle) && b[1][1].getText().equals(xOrcicle) && b[2][2].getText()
                .equals(xOrcicle)) {
            announceWinner(xOrcicle, f);
            System.out.println("Exito");
        }
        if (b[2][0].getText().equals(xOrcicle) && b[1][1].getText().equals(xOrcicle) && b[0][2].getText()
                .equals(xOrcicle)) {
            announceWinner(xOrcicle, f);
            System.out.println("Exito");
        }






    }




    private void announceWinner(String winner, JFrame f){
        int response = JOptionPane.showConfirmDialog(null, winner +
                " Won the game, try again?", "Tic tac toe", JOptionPane.YES_NO_OPTION);
switch (response){
    case JOptionPane.NO_OPTION:
        System.exit(0);
        break;
    case JOptionPane.YES_NO_OPTION:
f.dispose();
new Window();
}


    }



}
