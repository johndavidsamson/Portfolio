/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

public class CharacterDuel {

    public static void main(String args[]) {
        Dice dice = new Dice();
        Wizard wizard = new Wizard("Wizard", 10, 5, 15);
        LightningChicken lc = new LightningChicken("LightningChicken", 15, 15, 30);

        int dmg1 = 0;
        int dmg2 = 0;
        int i=0;
        while (true) {
            i++;
            System.out.println("\nROUND " + i);
            System.out.println(wizard.getname() + ": " + wizard.getcurrentLife());
            System.out.println(lc.getname() + ": " + lc.getcurrentLife());

            if (wizard.getcurrentLife() > 40 && wizard.getCurrentMagic() > 8) {
                dmg1 = wizard.castLightningBolt();
                System.out.println(wizard.getname() + " casts Lightning Bolt and damaged " + gynoid.getname() + " for " + dmg1);
                lc.wound(dmg1);
            } else if (wizard.getcurrentLife() <= 40 && wizard.getCurrentMagic() > 8) {
                int heal1 = wizard.castHeal();
                System.out.println(wizard.getname() + " uses Cast Heal and healed for " + heal1);
            } else {
                dmg1 = wizard.attack();
                lc .wound(dmg1);
                System.out.println(wizard.getname() + " attacks " + lc.getname() + " for " + dmg1);
            }

            if (lc.getcurrentLife() > 40 && gynoid.getCurrentFuel() > 8) {
                dmg2 = lc.rainbowinggust();
                System.out.println(lc.getname() + " launch Rocket Punch and damaged " + wizard.getname() + " for " + dmg2);
                wizard.wound(dmg2);
            } else if (lc.getcurrentLife() <= 40 && gynoid.getCurrentFuel() > 8) {
                int heal2 = lc.regenerate();
                System.out.println(lc.getname() + " Regenerates for " + heal2);
            } else {
                dmg2 = lc.attack();
                wizard.wound(dmg2);
                System.out.println(lc.getname() + " attacks " + wizard.getname() + " for " + dmg2);
            }

            if (wizard.getcurrentLife() < 1) {
                System.out.println("\nAlisa Wins!!!!!");
                System.exit(0);
            } else if (lc.getcurrentLife() < 1) {
                System.out.println("\nSnape Wins!!!!!");
                System.exit(0);
            }

        }

    }
}
