package ООП.Units;

import java.util.ArrayList;

public class Bandit extends AbstractMain{
    
    public Bandit (String name, float x, float y){
        super(name, "Bandit", 40, 8, 3, 4, 1, 4, 3, x, y, 0);
        
           
    } 

    public void step(ArrayList<AbstractMain> teamOpp, ArrayList<AbstractMain> teamMy) {
        if(curHp > 0){
            AbstractMain opponent =coordinates.opponent(teamOpp);
            if((opponent.coordinates.y - coordinates.y) > 0 && opponent.coordinates.x != coordinates.x){
                coordinates.stepForward(teamOpp, teamMy);
            }
            if((opponent.coordinates.y - coordinates.y) < 0 && opponent.coordinates.x != coordinates.x){
                coordinates.stepBack(teamOpp, teamMy);
            }
            if((opponent.coordinates.x - coordinates.x) < 0 && opponent.coordinates.y == coordinates.y){
                coordinates.stepLeft(teamOpp, teamMy);
            }
            if((opponent.coordinates.x - coordinates.x) > 0 && opponent.coordinates.y == coordinates.y){
                coordinates.stepRight(teamOpp, teamMy);
            }
            opponent.curHp = (opponent.curHp + opponent.evasion + opponent.defense) - meleeDamage;
        }
        else{dead = 1;} 
    }
    public String getInfo() {
        return (type +"="+name + "(" + coordinates.x +","+ coordinates.y + ")" + " " + "hp="+curHp);
        }
}
