package lib;

public class Map {
    private boolean[] map_bool;
    private Cell[] map;

    public boolean[] getMapUF(){
        boolean[] temp = new boolean[this.map.length];
        for (int i = 0; i < this.map.length; i++){
            temp[i] = this.map[i].is_alive();
        }
        return null;
    }

    public Cell[] getMap(){
        return this.map;
    }

    public void setMap(boolean[] map){
        for(int i = 0; i < this.map.length; i++){
            this.map[i].setStatus(map[i]);
        }
    }

    public void updateMap(Cell[] update){
        this.map = update;
    }
}
