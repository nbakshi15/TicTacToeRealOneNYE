package com.company;

/**
 * Created by nini on 12/29/2016.
 */
public class Board {
    public String b[][];
    public int g;
    public static int player(String a) {
        if (a.equalsIgnoreCase("X"))
            return 1;
        if (a.equalsIgnoreCase("O"))
            return -1;
        else
            return 0;
    }

    public Board(String a[][])
    {
        b=a;
    }
    public void printBoard()
    {
        System.out.println(" 1| 2| 3");
        System.out.print("1 ");
        g = 0;
        for (int k = 0; g < 3; k++) {
            System.out.print(b[g][k] + " ");
            if (k >= 2) {
                System.out.println();
                if (g+2<4) {
                    System.out.print(g + 2 + " ");
                }
                g++;
                k = -1;
            }
        }
    }

    public static boolean moveBD(String z[][]) {
        int total = 0;
        int w = 0;
        while (w < z.length) {
            total = total + Board.player(z[w][w]);
            w++;
        }
        if (Math.abs(total) == 3)
            return true;
        w = 0;
        total = 0;
        while (w < z.length) {

            total= total + Board.player(z[2 - w][w]);
            w++;
        }
        if (Math.abs(total) == 3)
            return true;
        total = 0;
        for (int rows = 0; rows < z.length; rows++) {
            for (int cols = 0; cols < z.length; cols++) {
                total = total + Board.player(z[rows][cols]);
            }
            if (Math.abs(total) == 3)
                return true;
            total = 0;
        }
        total = 0;
        for (int cols = 0; cols < z.length; cols++) {
            for (int rows = 0; rows < z.length; rows++) {
                total = total + Board.player(z[rows][cols]);
            }
            if (Math.abs(total) == 3)
                return true;
            total = 0;
        }
        return false;
    }

}
