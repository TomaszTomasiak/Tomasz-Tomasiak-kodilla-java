public class SudokuRun {



    public static void main(String[] args) {

        boolean gameFinished = false;

        while(!gameFinished) {
            SudokuGame sudokuGame = new SudokuGame();
            gameFinished = sudokuGame.resolveSudoku();
        }
    }
}
