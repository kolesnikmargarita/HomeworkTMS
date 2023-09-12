package Homework5.MainTask;

public class Main2 {

    public static void main(String[] args) {

        String[][] board = new String[8][8];
        for(int i = 0; i < board.length; i += 2) {
            for(int j = 0; j < board[i].length; j += 2) {
                board[i][j] = "W";
                board[i][j + 1] = "B";
                board[i + 1][j] = "B";
                board[i + 1][j + 1] = "W";
            }
        }
        for(String[] i : board) {
            for(String j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
