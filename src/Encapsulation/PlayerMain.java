package Encapsulation;

public class PlayerMain {
    public static void main(String[] args) {

        Player player= new Player("Tim", 10, "Bat");
        System.out.println(player);
        player.healthRemaining();
        player.restoreHealth(50);
        player.healthRemaining();
        player.loseHealth(20);
        player.healthRemaining();
    }
}
