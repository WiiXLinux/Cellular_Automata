package lib;

public class Rules {

    public Rules(int min, int max, int birth, Cell[] m3x3matrix) {
        this.min = min;
        this.max = max;
        this.birth = birth;
    }

    private int min;
    private int max;
    private int birth;
    private Cell[] matrix;

    private int getNeighbours() {
        int temp = 0;
        for (int i = 0; i < 9; i++) {
            temp = temp + (matrix[i].is_alive() ? 1 : 0);
        }
        return temp - (matrix[4].is_alive() ? 1 : 0);
    }

    public String getRules() {
        return "Cell survives with " + min + "-" + max + " neighbours\n" +
                "and is born with " + birth + " neighbours";
    }

    public Cell execute() throws Exception {
        if (matrix[4].is_alive()) {
            if (max < getNeighbours() || getNeighbours() < min) {
                return new Cell(false);
            }
        } else {
            if (getNeighbours() == birth) {
                return new Cell(true);
            }
        }
        throw new Exception("Cell not existing");
    }

}
