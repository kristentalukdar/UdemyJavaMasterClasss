package Kitchen;

public class CoffeeMaker extends SmartKitchen{

    protected boolean hasWorkToDo;

    public CoffeeMaker( boolean hasWorkToDo) {
        super();
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if(hasWorkToDo) {
            System.out.println("Coffee is brewed");
        }
    }
}
