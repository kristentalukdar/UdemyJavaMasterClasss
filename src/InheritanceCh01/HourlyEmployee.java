package InheritanceCh01;

public class HourlyEmployee extends Employee{
    protected double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, long employeeId, String hireDate, double hourlyPayRate) {
        super(name, birthDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay(){
        this.hourlyPayRate*=2;
    }
}
