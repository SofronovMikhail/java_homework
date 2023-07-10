package ООП;

import java.util.ArrayList;

public class Spearman extends AbstractMain{
    public float endurance;
    
    public Spearman (String name, float x, float y){
        super(name, "Spearman", 50, 10, 6, 5, 5, 3, 1, x, y);
        this.endurance = 8;
           
    } 
    public void step(ArrayList<AbstractMain> teamOpp, ArrayList<AbstractMain> teamMy) {
        System.out.println("who's on me");
    }
    public String getInfo() {
        return (type +"="+name + "(" + coordinates.x +","+ coordinates.y + ")" + " " + "hp="+curHp);
        }
}
