package Encapsulation;

public class PrinterMain {
    public static void main(String[] args) {
        Printer printer= new Printer(25,  true);
        System.out.println("Initial number of pages printed: "+printer.getPagesPrinted());
        printer.printPages(11);
        System.out.println("Updated number of pages printed: "+printer.getPagesPrinted());
    }
}
