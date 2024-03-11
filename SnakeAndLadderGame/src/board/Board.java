package board;
import java.util.*;
import jumper.Jumper;

public class Board 
{
    int sz;
   public String board[][];
   public HashMap<String,Jumper> jumpers=new HashMap<>();  
      int count;

   public Board(int sz,HashMap<String,Jumper> jumpers){
    this.sz=sz;
    this.jumpers=jumpers;
    board=new String[sz][sz];
   count=1;

   
   for(int row=sz-1;row>=0;row--){
    if(row%2!=0){
        for(int col=0;col < sz;col++){
             board[row][col]= count + "";
             count++;
        }  
    }
    else{
        for(int col=sz-1;col >= 0;col--){
            board[row][col]= count + " ";
            count++;
       }  
    }
   }
}

  public void printBoard(){
    for(int i=0;i < sz;i++){
        for(int j=0;j < sz;j++){
            System.out.print(board[i][j] + " ");
        }
        System.out.println();
    }
  }

  public int getBoardSize(){
    return this.sz;
  }
}
