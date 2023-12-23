package Classes.Car;

public class CarMain {
    public static void main(String[] args) {
        Car c = new Car();
        c.setMake("Hyundai");
        c.setColor("Blue");
        c.setConvertible(false);
        c.setModel("Model X.5");
        c.setDoors(4);

        System.out.println("Make: "+ c.getMake());
        c.describeCar();

        Car t = new Car();
        t.setDoors(4);
        t.setColor("White");
        t.setModel("Targa");
        t.setMake("Porsche");
        t.setConvertible(false);

        t.describeCar();

    }
}
