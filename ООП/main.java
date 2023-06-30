package ООП;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.security.auth.kerberos.ServicePermission;

public class Main {
    public static void main(String[] args) {
        Mag mag = new Mag(getName());
        Peasant peasant = new Peasant(getName());
        Bandit bandit = new Bandit(getName());
        Shooter shooter = new Shooter(getName());
        Spearman spearman = new Spearman(getName());
        Arbalester arbalester = new Arbalester(getName());
        Priest priest = new Priest(getName());

      Random random = new Random();
      List<AbstractMain> commandHero_1 = new ArrayList<>();
      List<AbstractMain> commandHero_2 = new ArrayList<>();
      System.out.println("Team #1");
        for(int i = 0; i < 10; i++){

          switch(random.nextInt(0, 7)){
            case 1:
              commandHero_1.add(new Mag(getName()));
              break;
            case 2:
              commandHero_1.add(new Peasant(getName()));
              break;
            case 3:
              commandHero_1.add(new Bandit(getName()));
              break;
            case 4:
              commandHero_1.add(new Shooter(getName()));
              break;
            case 5:
              commandHero_1.add(new Spearman(getName()));
              break;
            case 6:
              commandHero_1.add(new Arbalester(getName()));
              break;
            default:
              commandHero_1.add(new Priest(getName()));
              break;
          }
          System.out.println(commandHero_1.get(i).getInfo()); 
          
        }
        System.out.println();
        System.out.println("Team #2");
        for(int i = 0; i < 10; i++){

          switch(random.nextInt(0, 7)){
            case 1:
              commandHero_2.add(new Mag(getName()));
              break;
            case 2:
              commandHero_2.add(new Peasant(getName()));
              break;
            case 3:
              commandHero_2.add(new Bandit(getName()));
              break;
            case 4:
              commandHero_2.add(new Shooter(getName()));
              break;
            case 5:
              commandHero_2.add(new Spearman(getName()));
              break;
            case 6:
              commandHero_2.add(new Arbalester(getName()));
              break;
            default:
              commandHero_2.add(new Priest(getName()));
              break;
          }
          
          System.out.println(commandHero_2.get(i).getInfo()); 
          
        }
      
      }  
    
      private static String getName(){
        String randomName = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return randomName;
      }  
}
    
