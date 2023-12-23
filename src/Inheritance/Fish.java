package Inheritance;

public class Fish extends Animal {

    private int fins;
    private int gills;

    public Fish(){
        super("Sting Fish", "Medium", 8);
    }

    public Fish(String type,  double weight, int fins, int gills) {
        super(type, weight<5?"Small":(weight<10)?"Medium": "Large", weight);
        this.fins = fins;
        this.gills = gills;
    }

    public Fish(String type, double weight){
        this(type,weight, 2, 4 );
    }

    public void moveMuscles(){
        System.out.println(type+" is moving muscles.");
    }

    public void moveBackFins(){
        System.out.println(type+ " is moving backwards.");
    }

    @Override
    public void move(String speed) {
        if (speed == "Slow") {
            moveMuscles();
        }
        else{
            moveBackFins();
        }
    }

    @Override
    public void makeNoise() {
        System.out.println(type+" is making noise");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                ", type='" + type + '\'' +
                "} " + super.toString();
    }
}
