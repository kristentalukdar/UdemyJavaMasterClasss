package Kitchen;

public class Refrigerator extends SmartKitchen{
    protected boolean hasWorkToDo;

    public Refrigerator( boolean hasWorkToDo) {
        super();
        this.hasWorkToDo = hasWorkToDo;
    }

    public void OrderFood(){
        if(hasWorkToDo) {
            System.out.println("Food is ordered.");
        }
    }
}
