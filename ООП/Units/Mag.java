package ООП.Units;

import java.util.ArrayList;

public class Mag extends AbstractMain{
    
    public float mana;
    public float rangedDamage;
    public float curMana;
    
    public Mag (String name, float x, float y){
        super(name, "Mag", 30, 0, 1, 0, 9, 7, 0, x, y, 0);
        this.rangedDamage = 10;
        this.mana = this.curMana = 10;      
    } 
   
    public void step(ArrayList<AbstractMain> teamOpp, ArrayList<AbstractMain> teamMy) {
        if(curHp > 0){
            if(curMana < 10){curMana  += 2;}
            AbstractMain opponent = coordinates.opponent(teamOpp);
            if(curMana >= 3) {
                if (coordinates.length(teamOpp) > 5) {
                    opponent.curHp = (float) ((opponent.curHp + opponent.evasion + opponent.defense) - (rangedDamage / 0.7));
                }
                opponent.curHp = (opponent.curHp + opponent.evasion + opponent.defense) - rangedDamage;
                curMana -= 3;
            }
        }
        else{dead = 1;}
    }
    public String getInfo() {
        return (type +"="+name + "(" + coordinates.x +","+ coordinates.y + ")" + " " + "hp="+curHp);
        }
}
