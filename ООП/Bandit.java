package ООП;

import java.util.ArrayList;

public class Bandit extends AbstractMain{
    
    public Bandit (String name, float x, float y){
        super(name, "Bandit", 40, 8, 3, 4, 1, 5, 3, x, y);
        
           
    } 

    public void step(ArrayList<AbstractMain> teamOpp, ArrayList<AbstractMain> teamMy) {
        System.out.println("die quickly");
    }
    public String getInfo() {
        return (type +"="+name + "(" + coordinates.x +","+ coordinates.y + ")" + " " + "hp="+curHp);
        }
}
