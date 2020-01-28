import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    public List<SudokuElement> rowSudokuElements;

    public SudokuRow() {
        rowSudokuElements = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            rowSudokuElements.add(new SudokuElement(SudokuElement.EMPTY));
        }
    }

}