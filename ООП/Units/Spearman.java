package ООП.Units;

import java.util.ArrayList;

public class Spearman extends AbstractMain{
    public float endurance;
    
    public Spearman (String name, float x, float y){
        super(name, "Spearman", 50, 10, 6, 5, 5, 3, 1, x, y, 0);
        this.endurance = 8;
           
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
