package ComputerFactory;

public class Motherboard extends  PersonalComputer{

    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public  Motherboard(String model, String manufacturer){
        super(model, manufacturer);
    }

    public void loadProgram(String programName){
        System.out.println("The name of the program is: "+ programName);
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "ramSlots=" + ramSlots +
                ", cardSlots=" + cardSlots +
                ", bios='" + bios + '\'' +
                "} " + super.toString();
    }
}
