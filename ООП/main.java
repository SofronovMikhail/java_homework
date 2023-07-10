package ООП;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
      

      ArrayList<AbstractMain> team1 = team(1);
      ArrayList<AbstractMain> team2 = team(10);
      
      for(int i = 7; i > 0; i--){
        for(int j = 0; j < 10; j++){
          if(team1.get(j).speed == i){
            team1.get(j).step(team2, team1);
          }
          if(team2.get(j).speed == i){
            team2.get(j).step(team1, team2);
          }
        }
        
      }
      team1.forEach(n -> System.out.println(n.getInfo()));
      team2.forEach(n -> System.out.println(n.getInfo()));

    }


      private static ArrayList<AbstractMain> team(int x){

        ArrayList<AbstractMain> newTeam = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 10; i++){
          switch(random.nextInt(0, 7)){
            case 1:
              newTeam.add(new Mag(getName(), x, i+1));
              break;
            case 2:
              newTeam.add(new Peasant(getName(), x, i+1));
              break;
            case 3:
             newTeam.add(new Bandit(getName(), x, i+1));
              break;
            case 4:
            newTeam.add(new Shooter(getName(), x, i+1));
              break;
            case 5:
            newTeam.add(new Spearman(getName(), x, i+1));
              break;
            case 6:
            newTeam.add(new Arbalester(getName(), x, i+1));
              break;
            default:
            newTeam.add(new Priest(getName(), x, i+1));
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
    
