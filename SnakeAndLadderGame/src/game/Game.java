package game;
import board.Board;
import player.Player;
import dice.Dice;
import coordinates.Coordinates;
import jumper.Jumper;


public class Game {
   
    
    Board board;
    Player[] players;
    boolean[] isAllowed;
    int turn;
    Coordinates[] place;
    Dice dice;

    public Game(Board board,Player[] players,Dice dice) {
        this.board=board;
        this.dice=dice;
        this.players=players;
        turn=0;
        isAllowed=new boolean[players.length];
        place=new Coordinates[players.length];

        for(int i=0;i<players.length;i++){
            place[i] = new Coordinates(board.getBoardSize()-1,0);
        }

      }


    public void play(){
         while(true){
            int num=dice.diceRoll();
            System.out.println(players[turn].getName()+" rolled -> " + num + "[" + place[turn].getRow() + ", " + place[turn].getCol() +" ]");
            if(!isAllowed[turn]){
                if(num!=1)  { 
                 turn=1-turn;
                 continue;
            }
          else{
            isAllowed[turn]=true;
          }
        }
        Coordinates newcoordinates=getNewCoordinates(place[turn],num);
        if(newcoordinates.getRow() < 0){
         System.out.println(players[turn].getName() + " has won");
         return;
        }

         place[turn] = newcoordinates;
         turn=1-turn;
         }
        }
        
         private Coordinates getNewCoordinates(Coordinates oldCoordinates,int num){
          int row=oldCoordinates.getRow();
          int col=oldCoordinates.getCol();            
           
           while(num > 0){
             if(row%2!=0){
                if(col == board.getBoardSize()-1) row--;
                else col++;
             }
             else{
                if(col == 0) row--;
                else col--;
             }
             num--;
           }
           if(row < 0) return new Coordinates(row, col);
           if(checkIfJumperExists(row,col)){
              Jumper jumper=board.jumpers.get(board.board[row][col]);
             
              return jumper.end;
           }

         return new Coordinates(row,col);
    }



        private boolean checkIfJumperExists(int row, int col)
         {
        return board.jumpers.containsKey(board.board[row][col]);    
        }
}
