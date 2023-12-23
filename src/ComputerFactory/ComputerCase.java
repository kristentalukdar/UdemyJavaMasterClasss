package ComputerFactory;

public class ComputerCase extends PersonalComputer{

    private String powerSupply;

    public  ComputerCase(String model, String manufacturer){
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        this(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed.");
    }

    @Override
    public String toString() {
        return "ComputerCase{" +
                "powerSupply='" + powerSupply + '\'' +
                "} " + super.toString();
    }
}
