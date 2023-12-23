package InheritanceCh01;

public class SalariedEmployee extends Employee{

    private double annualSalary;
    protected boolean isRetired;

    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate, double annualSalary) {
        super(name, birthDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire(){
        this.isRetired=true;
    }
}
