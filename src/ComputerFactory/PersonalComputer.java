package ComputerFactory;

public class PersonalComputer extends Product{

    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public  PersonalComputer(String model, String manufacturer){
        super(model, manufacturer);
    }

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
        this(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }



    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "computerCase=" + computerCase +
                ", monitor=" + monitor +
                ", motherboard=" + motherboard +
                "} " + super.toString();
    }
}

