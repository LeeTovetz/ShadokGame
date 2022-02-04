package shadok.game.java;

public class Field {

    private int rows;
    private int columns;

    private Fieldable[][] field;

    public Field(int sizeX, int sizeY) {
        this.rows = sizeX;
        this.columns = sizeY;
        field = new Fieldable[sizeX][sizeY];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setFieldable(int x, int y, Fieldable object) {

        field[x][y] = object;
    }

    public Fieldable getFieldable(int x, int y) {
        return field[x][y];
    }

    public void showField() {


        for (int i = 0; i < rows; i++) {

            System.out.println();

            for (int j = 0; j < columns; j++) {

                System.out.print(field[i][j].getSymbol());

            }
        }

        System.out.println();

    }
}