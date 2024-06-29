public class Toe {
   int a = 0;
    int b = 0;
    int c = 0;
    int d, e, f;
    boolean ganhou = false;
    boolean lose = false;
    Toe(){}
 void Win(){
        if(a == 1 && b == 1 && c == 1){
            System.out.println("Ganhou");
ganhou = true;

        } else if (d == 1 && e == 1 && f == 1){
         System.out.println("Perdeu");
         lose = true;
     }
 }

}
