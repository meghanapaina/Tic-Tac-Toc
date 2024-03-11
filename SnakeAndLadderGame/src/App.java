import player.Player;
import board.Board;
import dice.Dice;
import coordinates.Coordinates;
import jumper.Jumper;
import game.Game;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Snake and Ladder game I love this game");

        HashMap <String, Jumper> map=new HashMap<>();
        map.put("6" , new Jumper(new Coordinates(9,5),new Coordinates(6,6)));
        map.put("97" , new Jumper(new Coordinates(0,3),new Coordinates(9,9)));
        map.put("21" , new Jumper(new Coordinates(7,0),new Coordinates(0,9)));
        map.put("64" , new Jumper(new Coordinates(3,3),new Coordinates(7,6)));
        map.put("16" , new Jumper(new Coordinates(8,4),new Coordinates(3,6)));
        map.put("68" , new Jumper(new Coordinates(3,7),new Coordinates(7,8)));


 
       Player p1=new Player();
      p1.setDetailsfromUser(p1);
       //p1.getDetails();
    

       Player p2=new Player();
       p2.setDetailsfromUser(p2);
      

       p1.getName();
       p2.getName();

/* 
       Dice d=new Dice();
       System.out.println(d.diceRoll()); 
 
        Coordinates s=new Coordinates(7,4);
        Coordinates e=new Coordinates(9,4);
       
       Jumper j=new Jumper(s,e);
       System.out.println(j.getJumperName()); */

        Board b=new Board(10,map);
        b.printBoard();

        Game g1=new Game(b,new Player[] {p1,p2}, new Dice());
        g1.play();
    }
}
