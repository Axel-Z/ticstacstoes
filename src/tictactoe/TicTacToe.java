package tictactoe;

import java.util.*;
import java.io.*;

/**
 *
 * @author Axel
 */
public class TicTacToe {

    private final int ROW = 3;
    private final int COL = 3;
    
    public static final int EMPTY = 0;
    public static final int CROSS = 1;
    public static final int NOUGHT = 2;
    
    int[][] board;
    
    
    public TicTacToe () {
        board = new int[ROW][COL];
        
        printBoard();
    }
    
    
    
    public void printBoard () {
        for(int i = 0; i < ROW; i++) {
            for(int j = 0; j < COL; j++) {
                printCell(board[i][j]);
                if (j != COL - 1) 
                    System.out.print("|");
            }
            System.out.println();
            if (i != ROW - 1) 
                    System.out.println("------------------");
        }
        System.out.println();
    }
    
    public void printCell (int space) {
        switch (space) {
            case EMPTY:  System.out.print("     "); break;
            case NOUGHT: System.out.print("  O  "); break;
            case CROSS:  System.out.print("  X  "); break;
        }
    }
    
    
    /*public void initialTable () {
    
        System.out.println("Coordinates for the table, inputs will be based on the coordinates");
        System.out.println();
        System.out.println();
        
        System.out.println("     1,1   |  1,2  |   1,3");
        System.out.println("  -----------------------------");
        System.out.println("     2,1   |  2,2  |   2,3");
        System.out.println("  -----------------------------");
        System.out.println("     3,1   |  3,2  |   3,3");            
        
    }
    
    public void redrawAfterInput (int coord1, int coord2) {
        
        
            System.out.println("     1,1   |  1,2  |   1,3");
            System.out.println("  -----------------------------");
            System.out.println("     2,1   |  2,2  |   2,3");
            System.out.println("  -----------------------------");
            System.out.println("     3,1   |  3,2  |   3,3");    
        
    }*/
    
    
    public boolean checkX (char x) {
        
        
        
        return false;
    }
    
}
