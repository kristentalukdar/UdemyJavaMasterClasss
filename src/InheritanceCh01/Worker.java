package InheritanceCh01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Date;
import java.time.LocalDate;

public class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public double collectPay(){
        return 0.00;
    }

    public int getAge()  {
        LocalDate dob=LocalDate.parse(this.birthDate);
        LocalDate today= LocalDate.now();
        Period period= Period.between(dob, today);
        int years= period.getYears();
        int months=period.getMonths();
        int days= period.getDays();
        System.out.println("The age is: "+ years);
        return years;
    }

    public void terminate(String endDate){
        this.endDate=endDate;
    }



}
