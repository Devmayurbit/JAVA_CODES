public class back3 {

 public static Boolean isSafe(char board[][] , int row, int col){
    //verticalup
    for(int i=row-1;i>=0;i--){
        if(board[i][col] == 'Q'){
            return  false;
        }
    }

    //diagonal left up
for(int i=row-1 , j=col-1 ; i>=0 && j>=0 ; i-- ,j--){
    if(board[i][j] == 'Q'){
        return  false;
    }
}

// diagonal right up
for(int i=row-1 , j=col+1 ; i>=0 && j<board.length ; i--,j++){
    if(board[i][j] == 'Q'){
        return  false;
    }
}
return true;

 }


    public static void nQueens(char Board[][] , int row){
if(row == Board.length){
    printBoard(Board);
    return;
}
for(int j = 0 ; j <Board.length;j++){
    if(isSafe(Board, row, j)){
        Board[row][j] ='Q';
        nQueens(Board, row+1);
        Board[row][j] ='x';
    }
}
    }

    public static void printBoard(char Board[][]){
        System.out.println("--------- CHESS BOARD ----------");
        for(int i = 0 ; i<Board.length ; i++){
            for(int j = 0 ; j <Board.length ; j++){
                System.out.print(Board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n =5;
        char Board[][] = new char[n][n];
        
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                Board[i][j] = 'x';
            }
        }
        nQueens(Board,0);
    }
}
