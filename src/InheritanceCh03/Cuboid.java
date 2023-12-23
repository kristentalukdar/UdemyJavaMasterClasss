package InheritanceCh03;

public class Cuboid extends Rectangle{

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if(height<0){
            this.height=0;
        }
        else {
            this.height = height;
        }
    }

    public double getVolume(){
        double vol=getHeight()*height;
        return vol;
    }

    public double getHeight() {
        return height;
    }
}
