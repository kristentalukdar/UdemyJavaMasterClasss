package Classes.Car;

public class Car {

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public void describeCar(){
        System.out.println("Maker: "+ make+ ", Model: "+ model+ ", Color: "+color+ ", Doors: "+ doors+ (convertible?", Convertible":""));
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
         if(make==null){
             make="Unknown";
         }
         String lowerCaseMake= make.toLowerCase();
         switch(lowerCaseMake){
             case "holden", "porsche", "hyundai", "maruthi", "tesla"-> this.make=make;
             default -> {
                 this.make="Unsupported";
             }
         }
    }



}


