package ООП;

import java.util.ArrayList;
import java.util.Random;
import ООП.Units.AbstractMain;
import ООП.Units.Arbalester;
import ООП.Units.Bandit;
import ООП.Units.Mag;
import ООП.Units.Names;
import ООП.Units.Peasant;
import ООП.Units.Priest;
import ООП.Units.Shooter;
import ООП.Units.Spearman;

public class Main {
  public static ArrayList<AbstractMain> team1 = team(1);
  public static ArrayList<AbstractMain> team2 = team(10);
  public static ArrayList<AbstractMain> allTeam = new ArrayList<>();
    public static void main(String[] args) {      

      for(int i = 7; i > 0; i--){
        for(int j = 0; j < 10; j++){
          if(team1.get(j).speed == i){
            allTeam.add(team1.get(j));
          }
          if(team2.get(j).speed == i){
            allTeam.add(team2.get(j));
          }
          }
        }
      team1.forEach(n -> System.out.println(n.getInfo()));
      team2.forEach(n -> System.out.println(n.getInfo()));
      
    
     
        Viev.view();
        
      
    }
      private static ArrayList<AbstractMain> team(int y){

        ArrayList<AbstractMain> newTeam = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 10; i++){
          switch(random.nextInt(0, 7)){
            case 1:
              newTeam.add(new Mag(getName(), i+1, y));
              break;
            case 2:
              newTeam.add(new Peasant(getName(), i+1, y));
              break;
            case 3:
             newTeam.add(new Bandit(getName(), i+1, y));
              break;
            case 4:
            newTeam.add(new Shooter(getName(), i+1, y));
              break;
            case 5:
            newTeam.add(new Spearman(getName(), i+1, y));
              break;
            case 6:
            newTeam.add(new Arbalester(getName(), i+1, y));
              break;
            default:
            newTeam.add(new Priest(getName(), i+1, y));
              break;
          }
        }
        return newTeam;

      }  
          private static String getName(){
        String randomName = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return randomName;
      }  

      
      }

        
      
      
      

    
