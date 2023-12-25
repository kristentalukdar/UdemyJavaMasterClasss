package Christmas;

import java.time.LocalDate;
import java.util.Date;

public class ChristmasDay {

    private String santa;
    LocalDate christmasDay = LocalDate.now();
    protected Gift gift;

    public Gift merryChristmas(){
        santa="Papa";
        String boxTop = "******************************************************************************************************************";
        String boxBottom = "******************************************************************************************************************";

        System.out.println(boxTop);
        System.out.println("Since my birth, you have been my everyday Santa Claus, "+ santa + ".");
        System.out.println("Thank you for a joyous year in 2023.");
        santa="Tikli";
        System.out.println("May you appreciate this special gift from " + santa + ".");
        System.out.println("Enjoy "+ christmasDay);
        System.out.println("you will find your present in a place you adjust the sounds and bass of your entire jingle bells music system");
        System.out.println(boxBottom);
        return gift;
    }



}
