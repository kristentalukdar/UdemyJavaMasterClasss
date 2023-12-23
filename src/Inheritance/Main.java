package Inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal=new Animal("Bear", "Big", 120);
        Dog dog= new Dog("Dog", 38);
        Fish f1= new Fish();
        Fish f2=new Fish("Crab", 3, 8, 2);
        Fish f3= new Fish("Pond Fish", 12);


//        doAnimalStuff(animal, "Fast");
//        doAnimalStuff(dog, "medium");
//        doDogStuff(dog, "normal");
//        dog.move("Slow");
        System.out.println(f1);
        System.out.println("_ _ _ _");
        System.out.println(f2);
        System.out.println("_ _ _ _");
        System.out.println(f3);
        System.out.println("_ _ _ _");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }

    public static void doDogStuff(Dog dog, String speed){
        dog.makeNoise();
        dog.move(speed);
        System.out.println(dog);
        System.out.println("_ _ _ _");
    }
}
