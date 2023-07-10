package ООП;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
  
public class Team {

Random ran = new Random();

String getName(){
        String randomName = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return randomName;
      }  
public Team(int x){
    List<AbstractMain>teamHero = new ArrayList<>();

    for(int i = 0; i < 10; i++){
        switch(ran.nextInt(0, 7)){
            case 1:
            teamHero.add(new Mag(getName(), x, i+1));
              break;
            case 2:
            teamHero.add(new Peasant(getName(), x, i+1));
              break;
            case 3:
            teamHero.add(new Bandit(getName(), x, i+1));
              break;
            case 4:
            teamHero.add(new Shooter(getName(), x, i+1));
              break;
            case 5:
            teamHero.add(new Spearman(getName(), x, i+1));
              break;
            case 6:
            teamHero.add(new Arbalester(getName(), x, i+1));
              break;
            default:
            teamHero.add(new Priest(getName(), x, i+1));
              break;
          }
        }
    }
}


