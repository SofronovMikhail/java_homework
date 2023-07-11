package ООП.Units;

import java.util.ArrayList;

public class Mag extends AbstractMain{
    
    public float mana;
    public float rangedDamage;
    public float curMana;
    
    public Mag (String name, float x, float y){
        super(name, "Mag", 30, 0, 1, 0, 9, 7, 0, x, y);
        this.rangedDamage = 10;
        this.mana = this.curMana = 10;      
    } 
   
    public void step(ArrayList<AbstractMain> teamOpp, ArrayList<AbstractMain> teamMy) {
    if(hp > 0 || curMana > 0){
    if(curMana < 10){curMana  += 2;}
    int step = 0;
    for (AbstractMain elem : teamMy){
        if(elem.curHp <= 10){
            elem.curHp = elem.hp;
            step = 1;
            break;
        }
    }
    if(step == 0){
    AbstractMain opponent = opponent(teamOpp);
    if(length(teamOpp) > 5){opponent.curHp = (float) ((opponent.curHp + opponent.evasion + opponent.defense) - (rangedDamage / 0.7));}
    opponent.curHp = (opponent.curHp + opponent.evasion + opponent.defense) -rangedDamage;
    curMana -= 3;
    }
}
}
    public String getInfo() {
        return (type +"="+name + "(" + coordinates.x +","+ coordinates.y + ")" + " " + "hp="+curHp);
        }
}
