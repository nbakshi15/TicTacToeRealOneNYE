package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello! Welcome to The World's Best Tic Tac Toe Game");
        int x = 1;
        int turn = 0;
        int row, column;
        String reply = "";
        Scanner user = new Scanner(System.in);
        String board [][] = {{"-", "-", "-"},{ "-", "-", "-"},{ "-", "-","-"}};
        Board surface = new Board(board);
        surface.printBoard();
        System.out.println("You,the user, will be player X");
        while (!reply.equalsIgnoreCase("yes")&&!reply.equalsIgnoreCase("no")) {
            System.out.println("Would you like to go first? (yes or no)");
            reply = user.next();
        }
        while (reply.equalsIgnoreCase("yes"))
        {
            while (x==1) {
                System.out.println("Enter which row you would like to move to");
                row = user.nextInt() - 1;
                System.out.println("Enter which column you would like to move to");
                column = user.nextInt() - 1;
                if (Move.legal(row, column, board))
                    x = 0;
            }
            x = 1;
            String h = ArtIntel.moveAI(board);
            System.out.println(h);
            surface.printBoard();
            if (h.equalsIgnoreCase("Game over"))
                break;
            if(Board.moveBD(board)) {
                System.out.println("Game over");
                break;
            }
        }
        while (reply.equalsIgnoreCase("no"))
        {
            String h = ArtIntel.moveAI(board);
            System.out.println(h);
            surface.printBoard();
            if(Board.moveBD(board)) {
                System.out.println("Game over");
                break;
            }
            turn++;
            if (turn > 4)
            {
                System.out.println("Game over");
                break;
            }
            while (x==1) {
                System.out.println("Enter row to move to");
                row = user.nextInt() - 1;
                System.out.println("Enter column to move to");
                column = user.nextInt() - 1;
                if (Move.legal(row, column, board))
                    x = 0;
            }
            x = 1;
            surface.printBoard();
            if (h.equalsIgnoreCase("Game over"))
                break;
        }
    }
    }

