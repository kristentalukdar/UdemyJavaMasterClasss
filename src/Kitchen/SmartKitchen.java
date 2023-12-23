package Kitchen;

public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private  DishWasher dishWasher;
    private Refrigerator IceBox;

    public SmartKitchen(){}

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        IceBox = iceBox;
    }

    public void addWater(boolean val){
        brewMaster.hasWorkToDo=val;
    }

    public void pourMilk(boolean val){
        IceBox.hasWorkToDo=val;
    }

    public void loadDishWasher(boolean val){
        dishWasher.hasWorkToDo=val;
    }

    public void setKitchenState(boolean val1, boolean val2, boolean val3){
        addWater(val1);
        pourMilk(val2);
        loadDishWasher(val3);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        IceBox.OrderFood();
        dishWasher.doDishes();
    }
}
