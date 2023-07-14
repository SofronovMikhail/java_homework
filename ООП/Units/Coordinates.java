package ООП.Units;

import java.util.ArrayList;

public class Coordinates {


    public float x;
    public float y;

    private float leng(float x1, float y1, float x2, float y2){
        float leng = (float) Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        return leng;
      }

    public float length(ArrayList<AbstractMain> team) {
        float min = 11;
        float length = 0; 
        for(int i = 0; i < team.size(); i++){
            if(min > leng(x, y, team.get(i).coordinates.x, team.get(i).coordinates.y)){
               min = leng(x, y, team.get(i).coordinates.x, team.get(i).coordinates.y);
               length = min;
              }
        }
        return length;
    }

    public AbstractMain opponent(ArrayList<AbstractMain> team){
        float min = 11;
        AbstractMain opponent = team.get(0);
        for(int i = 0; i < team.size(); i++){
              if(min > leng(x, y, team.get(i).coordinates.x, team.get(i).coordinates.y) && team.get(i).curHp > 0){
                 min = leng(x, y, team.get(i).coordinates.x, team.get(i).coordinates.y);
                opponent = team.get(i);
                }
          }
          return opponent;
    }

    private boolean checkTop(ArrayList<AbstractMain> team){
        for (AbstractMain element : team) {
            if(element.coordinates.x == x && (element.coordinates.y - y) == 1){
                return true;
            }
        }
        return false;
    }

    private boolean checkBottom(ArrayList<AbstractMain> team){
        for (AbstractMain element : team) {
            if(element.coordinates.x == x && (element.coordinates.y - y) == -1){
                return true;
            }
        }
        return false;
    }

    private boolean checkLeft(ArrayList<AbstractMain> team){
        for (AbstractMain element : team) {
            if(element.coordinates.y == y && (element.coordinates.x - x) == -1){
                return true;
            }
        }
        return false;
    }

    private boolean checkRight(ArrayList<AbstractMain> team){
        for (AbstractMain element : team) {
            if(element.coordinates.y == y && (element.coordinates.x - x) == 1){
                return true;
            }
        }
        return false;
    }

    public void stepForward(ArrayList<AbstractMain> teamOpp, ArrayList<AbstractMain> teamMy) {
        if(length(teamOpp) > 1 && checkTop(teamMy) == false){
            y++;
        }
    }

    public void stepBack(ArrayList<AbstractMain> teamOpp, ArrayList<AbstractMain> teamMy) {
        if(length(teamOpp) > 1 && checkBottom(teamMy) == false){
            y--;
        }
    }

    public void stepLeft(ArrayList<AbstractMain> teamOpp, ArrayList<AbstractMain> teamMy) {
        if(length(teamOpp) > 1 && checkLeft(teamMy) == false){
            x--;
        }
    }

    public void stepRight(ArrayList<AbstractMain> teamOpp, ArrayList<AbstractMain> teamMy) {
        if(length(teamOpp) > 1 && checkRight(teamMy) == false){
            x++;
        }
    }

public Coordinates(float x, float y){
    this.x = x;
    this.y = y;
}
}
