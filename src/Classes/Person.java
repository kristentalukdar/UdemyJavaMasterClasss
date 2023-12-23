package Classes;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public boolean isTeen(){
        if ((age > 12) && (age < 20)) {
            return true;
        }
        return false;
    }

    public String getFullName(){
        String name=firstName+lastName;
        if((firstName=="") && (lastName=="")){
            return "";
        }
        if(firstName==""){
            return lastName;
        }
        if(lastName==""){
            return firstName;
        }
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if((age>100) || (age<0)){
            this.age=0;
            return;
        }
        this.age = age;
    }
}
