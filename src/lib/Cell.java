package lib;

public class Cell {


    public Cell(boolean status) {
        this.alive = status;
    }

    public Cell(boolean status, Enum type) {
        this.alive = status;
    }


    private boolean alive;
    private CellType own_type;


    public boolean is_alive() {
        return this.alive;
    }

    public void setStatus(boolean status){
        this.alive = status;
    }

    public void toggle() {
        this.alive = !this.alive;
    }


}
