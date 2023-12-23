package Kitchen;

public class Main {
    public static void main(String[] args) {

        CoffeeMaker coffeeMaker= new CoffeeMaker(false);
        DishWasher dishWasher= new DishWasher(false);
        Refrigerator refrigerator= new Refrigerator(false);
        SmartKitchen smartKitchen= new SmartKitchen(coffeeMaker, dishWasher, refrigerator);

        smartKitchen.setKitchenState(true, false, true);
        System.out.println(coffeeMaker.hasWorkToDo);
        System.out.println(dishWasher.hasWorkToDo);
        System.out.println(refrigerator.hasWorkToDo);

        smartKitchen.doKitchenWork();
    }
}
