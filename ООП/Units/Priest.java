package ООП.Units;

import java.util.ArrayList;

public class Priest extends AbstractMain {
    public float heal;
    public float mana;
    public float curMana;
    
    public Priest (String name, float x, float y){
        super(name, "Priest", 30, 2, 3, 4, 7, 1, 1, x, y, 0);
        this.heal = 10;
        this.mana = this.curMana = 10;
           
    } 
   
    public void step(ArrayList<AbstractMain> teamOpp, ArrayList<AbstractMain> teamMy) {
        if(curHp > 0) {
            if (curMana < 10) {
                curMana += 2;
            }
            if (curMana >= 3) {
                for (AbstractMain elem : teamMy) {
                    if (elem.curHp <= 10) {
                        elem.curHp += heal;
                        curMana -= 3;
                        break;
                    }
                }
            }
        }
        else{dead = 1;}
    }

    public String getInfo() {
        return (type +"="+name + "(" + coordinates.x +","+ coordinates.y + ")" + " " + "hp="+curHp);
        }

}
