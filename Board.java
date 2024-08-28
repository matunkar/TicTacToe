import java.io.*;
import java.util.*;

public class Board {

    public int[2][3] winningSeq;

    public String[][] board = { {"-","-","-"}, 
                                {"-","-","-"}, 
                                {"-","-","-"} };



    public Board () {

    }

    
    public void playX(int row, int col) {
        if(board[row][col] == "-") {
            board[row][col] = "X";
        }
    }


    public void playY(int row, int col) {
        if(board[row][col] == "-") {
            board[row][col] = "Y";
        }
    }


    public String winCon() {
        
    }
}
