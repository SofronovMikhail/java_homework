package ООП;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.security.auth.kerberos.ServicePermission;

public class Main {
    public static void main(String[] args) {

      /*Mag mag = new Mag(getName(), x, y);
        Peasant peasant = new Peasant(getName(), x, y);
        Bandit bandit = new Bandit(getName(), x, y);
        Shooter shooter = new Shooter(getName(), x, y);
        Spearman spearman = new Spearman(getName(), x, y);
        Arbalester arbalester = new Arbalester(getName(), x, y);
        Priest priest = new Priest(getName(), x, y);*/

      Random random = new Random();
      List<AbstractMain> commandHero_1 = new ArrayList<>();
      List<AbstractMain> commandHero_2 = new ArrayList<>();
      System.out.println("Team #1");
        for(int i = 0; i < 10; i++){
          switch(random.nextInt(0, 7)){
            case 1:
              commandHero_1.add(new Mag(getName(), 1, i+1));
              break;
            case 2:
              commandHero_1.add(new Peasant(getName(), 1, i+1));
              break;
            case 3:
              commandHero_1.add(new Bandit(getName(), 1, i+1));
              break;
            case 4:
              commandHero_1.add(new Shooter(getName(), 1, i+1));
              break;
            case 5:
              commandHero_1.add(new Spearman(getName(), 1, i+1));
              break;
            case 6:
              commandHero_1.add(new Arbalester(getName(), 1, i+1));
              break;
            default:
              commandHero_1.add(new Priest(getName(), 1, i+1));
              break;
          }
          System.out.println(commandHero_1.get(i).getInfo()); 
          
        }
        System.out.println();
        System.out.println("Team #2");
        for(int i = 0; i < 10; i++){

          switch(random.nextInt(0, 7)){
            case 1:
              commandHero_2.add(new Mag(getName(), 10, i+1));
              break;
            case 2:
              commandHero_2.add(new Peasant(getName(), 10, i+1));
              break;
            case 3:
              commandHero_2.add(new Bandit(getName(), 10, i+1));
              break;
            case 4:
              commandHero_2.add(new Shooter(getName(), 10, i+1));
              break;
            case 5:
              commandHero_2.add(new Spearman(getName(), 10, i+1));
              break;
            case 6:
              commandHero_2.add(new Arbalester(getName(), 10, i+1));
              break;
            default:
              commandHero_2.add(new Priest(getName(), 10, i+1));
              break;
          }
          
          System.out.println(commandHero_2.get(i).getInfo()); 
          
        }

        System.out.println();

        for(int i = 0; i < commandHero_1.size(); i++){
          float min = 11;
          Object n = "";
          for(int j = 0; j < commandHero_1.size(); j++){
            if(min > lang(commandHero_1.get(i).coordinates.x, commandHero_1.get(i).coordinates.y, commandHero_2.get(j).coordinates.x, commandHero_2.get(j).coordinates.y)){
              min = lang(commandHero_1.get(i).coordinates.x, commandHero_1.get(i).coordinates.y, commandHero_2.get(j).coordinates.x, commandHero_2.get(j).coordinates.y);
              n =  commandHero_2.get(j).getInfo();
            }
          }
          System.out.println(commandHero_1.get(i).getInfo() + " -> " + n + " lang " + min);
        }
      
      }  

    
      private static String getName(){
        String randomName = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return randomName;
      }  

      private static float lang(float x1, float y1, float x2, float y2){
        float lang = (float) Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        return lang;
      }
}
    
