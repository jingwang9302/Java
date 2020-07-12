package com.javaProgram;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Player player = new Player();
//        player.name = "Tracey";
//        player.health = 100;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        player.health = 200;
//        System.out.println("Player Health Remaining: " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("TE", 50, "sword");
        enhancedPlayer.loseHealth(30);
        System.out.println(enhancedPlayer.getHealth());
    }
}
