package ООП.Units;

import java.util.ArrayList;

public class Arbalester extends AbstractMain {
    
    public float rangedDamage;
    public int arrows;
    
    public Arbalester (String name, float x, float y){
        super(name, "Arbalester", 40, 0, 3, 0, 9, 6, 2, x, y, 0);
        this.rangedDamage = 9;
        this.arrows = 5;
       
    } 

public void step(ArrayList<AbstractMain> teamOpp, ArrayList<AbstractMain> teamMy) {
    if(curHp > 0 || arrows > 0){
    AbstractMain opponent =coordinates.opponent(teamOpp);
    if(arrows <= 3){
    for (AbstractMain elem : teamMy){
        if(elem.type == "Peasant" && elem.curHp > 0 && elem.stepLength == 0){
            arrows = 5;
            elem.stepLength = 1;
            break;
        }
    else{dead = 1;} 
    }
    }
    if(coordinates.length(teamOpp) > 5){
    opponent.curHp = (float) ((opponent.curHp + opponent.evasion + opponent.defense) - (rangedDamage / 0.7));}
    opponent.curHp = (opponent.curHp + opponent.evasion + opponent.defense) -rangedDamage;
    arrows -= 1;
    }
}


public String getInfo() {
    return (type +"="+name + "(" + coordinates.x +","+ coordinates.y + ")" + " " + "hp="+curHp);
    }




    
}

