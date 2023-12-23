package Inheritance;

public class Animal implements Cloneable{

    protected String type;
    private String size;
    private double weight;

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return  this.type==((Animal)obj).type;
    }

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public void move(String speed){
        System.out.println(type+ " moves at speed: "+ speed);
    }

    public void makeNoise(){
        System.out.println(type+ " makes some noise");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
}
