package Encapsulation;

public class Player {

    private String name;
    private int health;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        health-=damage;
        System.out.println(String.format("The updated health status after losing %d is: %d.", damage, health));
    }

    public void restoreHealth(int extraHealth){
        health+=extraHealth;
        System.out.println(String.format("The update health status after gaining health of %d is %d.", extraHealth, health));
    }

    public int  healthRemaining(){
        return 0;
    }
}
