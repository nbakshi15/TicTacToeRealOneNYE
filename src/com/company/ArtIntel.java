package com.company;

/**
 * Created by nini on 12/30/2016.
 */
public class ArtIntel {
    public static String moveAI(String j[][]) {
        int type = 0;
        int cani = 2;
        int total = 0;
        int w = 0;
        int r = 0;
        int c = 0;
        while (cani > -1) {
            total = 0;
            type = 0;
            w = 0;
            while (w < j.length) {
                total = total + Board.player(j[w][w]);
                w++;
            }
            if (-total== cani || -total == 3)
                if (Move.play(j, Integer.toString(type) + Integer.toString(w - 1) + Integer.toString(w - 1)))
                    return "The computer has played";

            type++;
            w = 0;
            total = 0;
            while (w < j.length) {
                total = total + Board.player(j[2 - w][w]);
                w++;
            }
            if (-total == cani || -total == 3)
                if (Move.play(j, Integer.toString(type) + Integer.toString(2 - w + 1) + Integer.toString(w - 1)))
                    return "The computer has played";
            type++;
            total = 0;
            for (int rows = 0; rows < j.length; rows++) { //horizontal
                for (int cols = 0; cols < j.length; cols++) {
                    total = total + Board.player(j[rows][cols]);
                    c = cols;
                }
                if (-total == cani || -total == 3)
                    if (Move.play(j, Integer.toString(type) + Integer.toString(rows) + Integer.toString(c)))
                        return "The computer has played";
                total = 0;
            }
            type++;
            total = 0;
            for (int cols = 0; cols < j.length; cols++) {
                for (int rows = 0; rows < j.length; rows++) {
                    total = total + Board.player(j[rows][cols]);
                    r = r;
                }
                if (-total == cani || - total== 3)
                    if (Move.play(j, Integer.toString(type) + Integer.toString(r) + Integer.toString(cols)))
                        return "The computer has played";
                total = 0;
            }
            total = 0;
            type = 0;
            w = 0;
            while (w < j.length) {
                total = total + Board.player(j[w][w]);
                w++;
            }
            if (total == cani || total == 3)
                if (Move.play(j, Integer.toString(type) + Integer.toString(w - 1) + Integer.toString(w - 1)))
                    return "The computer has played";
            type++;
            w = 0;
            total = 0;
            while (w < j.length) {
                total = total+ Board.player(j[2 - w][w]);
                w++;
            }
            if (total == cani ||total== 3)
                if (Move.play(j, Integer.toString(type) + Integer.toString(2 - w + 1) + Integer.toString(w - 1)))
                    return "The computer has played";
            type++;
            total = 0;
            for (int rows = 0; rows < j.length; rows++) {
                for (int cols = 0; cols < j.length; cols++) {
                    total = total + Board.player(j[rows][cols]);
                    c = cols;
                }
                if (total == cani || total == 3)
                    if (Move.play(j, Integer.toString(type) + Integer.toString(rows) + Integer.toString(c)))
                        return "The computer has played";
                total = 0;
            }
            type++;
            total = 0;
            for (int cols = 0; cols < j.length; cols++) {
                for (int rows = 0; rows < j.length; rows++) {
                    total = total+ Board.player(j[rows][cols]);
                    r = rows;
                }
                if (total == cani || total == 3)
                    if (Move.play(j, Integer.toString(type) + Integer.toString(r) + Integer.toString(cols)))
                        return "The computer has played";
                total = 0;
            }
            cani--;
        }
        return "Game over";
    }
}
