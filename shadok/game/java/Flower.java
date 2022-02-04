package shadok.game.java;

public class Flower implements Fieldable {

    private int transistors;

    private int rowIndex;

    private int columnIndex;

    public int getTransistors() {
        return transistors;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public int getColumnIndex() {
        return columnIndex;
    }

    public void setColumnIndex(int columnIndex) {
        this.columnIndex = columnIndex;
    }

    public Flower(int transistors, int rowIndex, int columnIndex) {
        this.transistors = transistors;
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
    }

    @Override
    public String getSymbol() {
        return String.valueOf(" " + transistors + " ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (rowIndex != flower.rowIndex) return false;
        return columnIndex == flower.columnIndex;
    }

    @Override
    public int hashCode() {
        int result = rowIndex;
        result = 31 * result + columnIndex;
        return result;
    }
}
