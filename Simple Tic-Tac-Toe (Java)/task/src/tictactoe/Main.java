package tictactoe;

import java.util.Scanner;

public class Main {
//    public static void fillBoard(String map, char[][] board) {
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                board[i][j] = map.charAt(i * 3 + j);
//            }
//        }
//    }

    public static void showBoard(char[][] board) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    public static boolean checkMove(char[][] board, int ngang, int doc, char move) {
        boolean limit = ngang > 2 || doc > 2;
        if (limit) {
            System.out.println("Coordinates should be from 1 to 3!");
            return false;
        }
        boolean empty = board[ngang][doc] == 'X' || board[ngang][doc] == 'O';
        if (empty) {
            System.out.println("This cell is occupied! Choose another one!");
            return false;
        }
        board[ngang][doc] = move;
        return true;
    }

    public static boolean checkState(char[][] board, int XMove, int OMove) {
        boolean XWin = false;
        boolean OWin = false;
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                if (board[i][0] == 'X') {
                    XWin = true;
                } else if (board[i][0] == 'O') {
                    OWin = true;
                }
            }
            if (board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                if (board[0][i] == 'X') {
                    XWin = true;
                } else if (board[0][i] == 'O') {
                    OWin = true;
                }
            }
        }

        if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            if (board[0][0] == 'X') {
                XWin = true;
            } else if (board[0][0] == 'O') {
                OWin = true;
            }
        }
        if (board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            if (board[0][2] == 'X') {
                XWin = true;
            } else if (board[0][2] == 'O') {
                OWin = true;
            }
        }

        if (XMove - OMove > 1 || OMove - XMove > 1 || (XWin && OWin)) {
            System.out.println("Impossible");
        } else if (XWin || OWin) {
            System.out.println(XWin ? "X wins" : "O wins");
            return true;
        } else if (XMove + OMove < 9) {
            return false;
        } else if (XMove + OMove == 9) {
            System.out.println("Draw");
        }
        return true;
    }


    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
//        String map = scanner.nextLine();

        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
//        fillBoard(map, board);
        showBoard(board);

        int XMove = 0;
        int OMove = 0;
        char move;

        while (!checkState(board, XMove, OMove)) {
            int ngang = scanner.nextInt() - 1;
            int doc = scanner.nextInt() - 1;
            if (XMove == OMove) {
                move = 'X';
            } else {
                move = 'O';
            }

//            while (!scanner.hasNextInt()) {
//                System.out.println("You should enter numbers!");
//                ngang = scanner.nextInt() - 1;
//                doc = scanner.nextInt() - 1;
//            }

            while (!checkMove(board, ngang, doc, move)) {
                ngang = scanner.nextInt() - 1;
                doc = scanner.nextInt() - 1;
            }
            if (XMove == OMove) {
                XMove++;
            } else {
                OMove++;
            }
            showBoard(board);
        }
    }
}
