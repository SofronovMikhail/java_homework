package ООП;

import java.util.ArrayList;

public class Priest extends AbstractMain {
    public float heal;
    public float mana;
    public float curMana;
    
    public Priest (String name, float x, float y){
        super(name, "Priest", 30, 2, 3, 4, 7, 6, 1, x, y);
        this.heal = 4;
        this.mana = this.curMana = 10;
           
    } 
    public void step(ArrayList<AbstractMain> teamOpp, ArrayList<AbstractMain> teamMy) {
        System.out.println("who to save");
    }
    public String getInfo() {
        return (type +"="+name + "(" + coordinates.x +","+ coordinates.y + ")" + " " + "hp="+curHp);
        }

}
