package ООП;

import java.util.ArrayList;

public class Arbalester extends AbstractMain {
    
    public float rangedDamage;
    public int arrows;
    
    public Arbalester (String name, float x, float y){
        super(name, "Arbalester", 40, 0, 3, 0, 9, 2, 2, x, y);
        this.rangedDamage = 9;
        this.arrows = 5;
       
    } 

public void step(ArrayList<AbstractMain> teamOpp, ArrayList<AbstractMain> teamMy) {
    if(hp > 0 || arrows > 0){
    System.out.println("who needs bolts");
    AbstractMain opponent = opponent(teamOpp);
    arrows -= 1;
    for (AbstractMain elem : teamMy){
        if(elem.type == "Peasant" && elem.curHp > 0){arrows = 5;}  
    }
    if(length(teamOpp) > 5){opponent.curHp = (float) ((opponent.curHp + opponent.evasion + opponent.defense) - (rangedDamage / 0.7));}
    opponent.curHp = (opponent.curHp + opponent.evasion + opponent.defense) -rangedDamage;
    arrows -= 1;
    }
}


public String getInfo() {
    return (type +"="+name + "(" + coordinates.x +","+ coordinates.y + ")" + " " + "hp="+curHp);
    }



    
}

