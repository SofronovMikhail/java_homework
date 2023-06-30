package ООП;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Mag mag = new Mag(getName());
        Peasant peasant = new Peasant(getName());
        Bandit bandit = new Bandit(getName());
        Shooter shooter = new Shooter(getName());
        Spearman spearman = new Spearman(getName());
        Arbalester arbalester = new Arbalester(getName());
        Priest priest = new Priest(getName());
    }   
      private static String getName(){
        String randomName = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return randomName;
      }  
}
    
