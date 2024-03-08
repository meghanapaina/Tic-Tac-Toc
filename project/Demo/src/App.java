import board.Board;
import player.Player;
import game.Game;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("First project -> Tic tac toc");

        Board b=new Board(3,'-');
      //  b.setDefalutSym('-');
        b.printBoardConfig();


       /*  Scanner sc=new Scanner(System.in);

        System.out.println("enter name of the player:");
        String name=sc.nextLine();
        System.out.println("enter the symbol of player");
        char sym=sc.nextLine().charAt(0);*/

        Player p1=new Player();
        p1.setValues("megha",'x',"gxhdcd@","8328238350","vzm",19);
      // p1.setValues(name,sym);
        p1.getValues();

        Player p2=new Player();
        p2.setValues("Prashu",'o');
        p2.getValues();
     
         Game g=new Game(new Player[] {p1,p2},b);
         g.play();


    }
}
