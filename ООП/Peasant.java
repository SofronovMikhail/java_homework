package ООП;

import java.util.ArrayList;

public class Peasant extends AbstractMain {
    
    public Peasant (String name, float x, float y){
        super(name, "Peasant", 30, 4, 2, 7, 5, 7, 1, x, y);
           
}
public void step(ArrayList<AbstractMain> teamOpp, ArrayList<AbstractMain> teamMy) {
    System.out.println("where to plow");
}
public String getInfo() {
    return (type +"="+name + "(" + coordinates.x +","+ coordinates.y + ")" + " " + "hp="+curHp);
    }
}