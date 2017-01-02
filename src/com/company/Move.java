package com.company;

/**
 * Created by nini on 12/29/2016.
 */
public class Move {
    public static boolean legal(int r, int c, String array[][])
    {
        if (r >= 0 && r <= 2 && c >= 0 && c <= 2)
            if (Board.player(array[r][c]) == 0) {
                array[r][c] = "X";
                return true;
            }
        System.out.println("That space is already occupied. Try again");
        return false;
    }

    public static boolean play(String[][] e, String s)
    {
        int mo = Integer.valueOf(s.substring(0,1));
        int row = Integer.valueOf(s.substring(1,2));
        int column = Integer.valueOf(s.substring(2,3));
        if (mo == 0) {
            for (int w = 0; w < e.length; w++) {
                if (Board.player(e[w][w]) == 0) {
                    e[w][w] = "O";
                    return true;
                }
            }
        }
        if (mo == 1) {
            for (int w = 0; w < e.length; w++) {
                if (Board.player(e[2 - w][w]) == 0) {
                    e[2 - w][w] = "O";
                    return true;
                }
            }
        }
        if (mo == 2) {
            for (int w = 0; w < e.length; w++) {
                if (Board.player(e[row][w]) == 0) {
                    e[row][w] = "O";
                    return true;
                }
            }
        }
        if (mo == 3) {
            for (int w = 0; w < e.length; w++) {
                if (Board.player(e[w][column]) == 0) {
                    e[w][column] = "O";
                    return true;
                }
            }
        }
        return false;
    }
}
