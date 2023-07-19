package ООП;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
    try (Scanner in = new Scanner(System.in)) {
      while(true){
          Viev.view();
          in.nextLine();
          for (AbstractMain hero : allTeam) {
            if(team2.contains(hero)){
              hero.step(team1, team2);
            }
            else{hero.step(team2, team1);}
          }
          if(gameOver(team1) == true){
            System.out.println("team2 win");
            break;
          }  
          if(gameOver(team2) == true){
            System.out.println("team1 win");
            break;
          }        
        }
    }
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
      public static boolean gameOver(ArrayList<AbstractMain> team){
        int count = 0;
        for (AbstractMain element : team) {
          if(element.dead == 1){
            count++;
          }
        }
        if(count == 10){return true;}
        return false;
    }
      }

        
      
      
      

    
