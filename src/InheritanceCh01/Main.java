package InheritanceCh01;

public class Main {

    public static void main(String[] args) {
        Worker worker=new Worker("Anjali", "1999-05-05");
        Employee employee= new Employee("Akanksha", "2001-11-11", 101, "2023-03-11");
        SalariedEmployee salariedEmployee= new SalariedEmployee("Manya", "1998-10-12", 102, "2000-05-12", 50000);
        HourlyEmployee hourlyEmployee= new HourlyEmployee("Ramya", "1990-03-10", 102, "2012-05-05", 500);

        System.out.println(employee.collectPay());

        salariedEmployee.retire();
        System.out.println(salariedEmployee.isRetired);
        System.out.println(salariedEmployee.collectPay());

        hourlyEmployee.getDoublePay();
        System.out.println(hourlyEmployee.hourlyPayRate);

        employee.getAge();

    }
}
