package Kitchen;

public class DishWasher extends SmartKitchen{

    protected boolean hasWorkToDo;

    public DishWasher( boolean hasWorkToDo) {
        super();
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if(hasWorkToDo) {
            System.out.println("Dishes are being done.");
        }
    }
}
