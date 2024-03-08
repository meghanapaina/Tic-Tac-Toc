package game;
import java.util.Scanner;
import board.Board;
import player.Player;

public class Game
 {
    Player[] players;
    Board board;
    int turn;
    int moves;
    boolean gameover;
    String zero;
    String cross;


    public Game( Player[] players,Board board)
    {
      this.players=players;
      this.board=board;
      this.turn=0;
      this.moves=0;
      this.gameover=false;
      StringBuilder z=new StringBuilder();
      StringBuilder c=new StringBuilder();

      for(int i=0;i < board.size;i++)
      {
          z.append('o');
          c.append('x');
      }

      this.zero=z.toString();
      this.cross=c.toString();
    }

      public void  printBoardConfig()
  {
    int sz=this.board.size;
    for(int i=0;i < sz;i++){
        for(int j=0;j < sz;j++){
            System.out.print(board.matrix[i][j] + " ");
        }
        System.out.println();
    }
   }

   public void play(){
    printBoardConfig();
 int sz=board.size;

    while (!gameover) {
        moves++;
        int idx=getIndex();

        int row=idx/sz;
        int col=idx%sz;

        board.matrix[row][col]=players[turn].getsym();
       

        if(moves >= sz*sz){
          System.out.println("game draw");
          return;
        }

        if(moves >= 2*sz-1  && checkComb() == true ){
          gameover=true;
          printBoardConfig();
        System.out.println("winner is "+players[turn].getname());
         return;
        }
        turn=(turn+1) % 2;
        printBoardConfig();
   }

  }
    public int getIndex(){

        while(true)
        {
            System.out.println("player: "+players[turn].getname() +" give some position ");
            Scanner sc=new Scanner(System.in);
            int pos=sc.nextInt();

            int sz=board.size;
    
            int row=pos/sz;
            int col=pos%sz;

            if(row < 0 || row >= sz || col < 0 || col >= sz){
              System.out.println("Invalid position");
              continue;
            }

           if (board.matrix[row][col] != '-'){
                System.out.println("position  already inserted");
                continue;
             }
      
             return pos;
            }
     }

    public boolean checkComb()
    {
        int sz=board.size;

        //row wise
        for(int i=0;i < sz;i++){
            StringBuilder s=new StringBuilder();
            for(int j=0;j < sz;j++){
              s.append(board.matrix[i][j]);
            }
           String pat=s.toString();
            if(pat.equals(zero) || pat.equals(cross))
                return true;
        }

         //col wise
 
         for(int i=0;i < sz;i++){
            StringBuilder s=new StringBuilder();
            for(int j=0;j < sz;j++){
              s.append(board.matrix[j][i]);
            }
           String pat=s.toString();
            if(pat.equals(zero) || pat.equals(cross))
                return true;
        }


     // diag

        int i=0,j=0;
        StringBuilder s=new StringBuilder();
        while(i < sz){
            s.append(board.matrix[i][j]);
            i++;
            j++;
        }
        String pat=s.toString();
        if(pat.equals(zero) || pat.equals(cross)){
            return true;
        }

    //anti

    i=0;
    j=sz-1;
    s=new StringBuilder();
    while(i < sz){
        s.append(board.matrix[i][j]);
        i++;
        j--;
    }
    pat=s.toString();
    if(pat.equals(zero) || pat.equals(cross)){
        return true;

    }
    return false;
 
    }

 
    
}
