package RPG;

import java.util.*;

public class RPG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dice dice = new Dice();
        Characters char1 = new Characters();
        Characters char2 = new Characters();

        //setters for first character
        char1.setName("BOB");
        char1.setML();
        char1.setDex(5);
        char1.setIntel(5);
        char1.setStrength(5);

        //setters for second character
        char2.setName("JOE");
        char2.setML();
        char2.setDex(5);
        char2.setIntel(5);
        char2.setStrength(5);

        int a = 1;
        for (int i = 0; i <= 2; i++) {
            System.out.println("Round: " + (i + a));
            System.out.println("CurrentLife: " + char1.getName() + ":" + char1.getCL());
            System.out.println("CurrentLife: " + char2.getName() + ":" + char2.getCL());
            char1.wound(dice.roll());
            System.out.println(char2.getName() + " attacks " + char1.getName() + " for " + char1.getDamage());
            char2.wound(dice.roll());
            System.out.println(char1.getName() + " attacks " + char2.getName() + " for " + char2.getDamage());
            System.out.println(char1.getName() + " HP: " + char1.getCL());
            System.out.println(char2.getName() + " HP: " + char2.getCL());
            System.out.println("********************************");
        }
        if (char1.getCL() < char2.getCL()) {
            System.out.println(char2.getName() + " wins! ");
        } else if (char2.getCL() <= char1.getCL()) {
            System.out.println(char1.getName() + " wins! ");
        }
    }

}
