package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Hello! Welcome to The World's Best Tic Tac Toe Game");
        int x = 1;
        int turn = 0;
        int row, column;
        String response = "";

        String board [][] = {{"-", "-", "-"},{ "-", "-", "-"},{ "-", "-","-"}};
        Board surface = new Board(board);
        surface.printBoard();
        System.out.println("You,the user, will be player X");
        while (!response.equalsIgnoreCase("yes")&&!response.equalsIgnoreCase("no")) {
            System.out.println("Would you like to go first? (yes or no)");
            response = user.next();
        }
        while (response.equalsIgnoreCase("yes"))
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
            String hello = ArtIntel.moveAI(board);
            System.out.println(hello);
            surface.printBoard();
            if (hello.equalsIgnoreCase("Game over"))
                break;
            if(Board.moveBD(board)) {
                System.out.println("Game over");
                break;
            }
        }
        while (response.equalsIgnoreCase("no"))
        {
            String hello = ArtIntel.moveAI(board);
            System.out.println(hello);
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
            if (hello.equalsIgnoreCase("Game over"))
                break;
        }
    }
    }

