package ООП.Units;

import java.util.ArrayList;

public class Bandit extends AbstractMain{
    
    public Bandit (String name, float x, float y){
        super(name, "Bandit", 40, 8, 3, 4, 1, 4, 3, x, y);
        
           
    } 

    public void step(ArrayList<AbstractMain> teamOpp, ArrayList<AbstractMain> teamMy) {
        AbstractMain opponent =coordinates.opponent(teamOpp);
        if(curHp > 0){
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
    }
    public String getInfo() {
        return (type +"="+name + "(" + coordinates.x +","+ coordinates.y + ")" + " " + "hp="+curHp);
        }
}
