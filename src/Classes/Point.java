package Classes;

import static java.lang.Math.pow;

public class Point {

    private int x;
    private int y;

    public Point(){}

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public double distance(){
        double d= (double) Math.sqrt(pow(x,2)-pow(y,2));
        return d;
    }

    public double distance(int x, int y){
        double d=(double) Math.sqrt(pow((this.x-x), 2)- pow((this.y-y), 2));
        return d;
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
}
