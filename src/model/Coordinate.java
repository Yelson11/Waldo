package model;

public class Coordinate {
    private int x,y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public Boolean compare(int x, int y, int distance){
        if(Math.sqrt((Math.pow((this.x-x), 2)+(Math.pow((this.y-y), 2))))>=distance)return false;
        else return true;
    }
    
    //Math.abs(this.x-x)>10 && Math.abs(this.y-y)>10
}
