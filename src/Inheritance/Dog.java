package Inheritance;

public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(){
        super("Dog", "Small", 40);
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight< 15? "Small": (weight< 35? "Medium": "Large") , weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }


    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    public void bark(){
        System.out.println("Dog is barking");
    }

    public void run(){
        System.out.println("Dog is runninh");
    }

    public void walk(){
        System.out.println("Dog is walking");
    }

    public void wagTail(){
        System.out.println("Dog is wagging tail");
    }

    @Override
    public void move(String speed) {
        //super.move(speed);
        if(speed=="Slow"){
            walk();
            wagTail();
        }
        else{
            run();
            bark();
        }
    }

    @Override
    public void makeNoise() {
        //super.makeNoise();
        System.out.println("Dog class makeNoise method called");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
