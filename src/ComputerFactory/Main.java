package ComputerFactory;

public class Main {

    public static void main(String[] args) {
        ComputerCase theCase= new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor= new Monitor("27 Inch beast", "Acer", 27, "2540 X 1440");
        Motherboard theMotherboard= new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        PersonalComputer thePC= new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);

        thePC.getComputerCase().pressPowerButton();
        thePC.getMonitor().drawPixel(10, 10, "Red");
        thePC.getMotherboard().loadProgram("Windows OS");

        System.out.println(theCase);
        System.out.println(theMonitor);
        System.out.println(theMotherboard);
        System.out.println(thePC);

    }
}
