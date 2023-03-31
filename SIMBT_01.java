import java.util.*;
public class tictactoe{
    public static void print(char[][] board) {
        for(int i=0;i<board.length;i++)
        {for(int j=0;j<board[0].length;j++)
         {
            System.out.print(board[i][j]+" ");
         }
         System.out.println();
        }
    }
    public static boolean won(char player,char[][] board) {
        for(int i=0;i<board.length;i++)
        {
            if(board[i][0]==player&&board[i][1]==player&&board[i][2]==player)
            {return true;}
        }
        for(int j=0;j<board[0].length;j++)
        {
            if(board[0][j]==player&&board[1][j]==player&&board[2][j]==player)
            {return true;}
        }
        if(board[0][0]==player&&board[1][1]==player&&board[2][2]==player)
        {return true;}
        if(board[0][2]==player&&board[1][1]==player&&board[2][0]==player)
        {return true;}
        return false;
    }
   public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int i=0;i<board.length;i++)
        {for(int j=0;j<board[0].length;j++)
         {
            board[i][j]='_';
         }
        }
        boolean game= false;
        Scanner sc =new Scanner(System.in);
        char player='X';
        while(!game)
        {
            print(board);
            System.out.println("Player "+ player +" Enter the row and column:");
            int row = sc.nextInt();
            int col = sc.nextInt();
            if(board[row][col]=='_')
            {
                
                board[row][col]= player;
                game=won(player,board);
                if(game)
                {
                    System.out.println("Player "+ player +" Has won");
                }
                else
                {
                    if(player=='X')
                    player='O';
                    else
                    player='X';
                }

            }
            else{
                System.out.println("Play Another Move");
            }
        }
        print(board);

    }
}