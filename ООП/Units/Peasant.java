package ООП.Units;

import java.util.ArrayList;

public class Peasant extends AbstractMain {
    
    public Peasant (String name, float x, float y){
        super(name, "Peasant", 30, 0, 2, 0, 0, 2, 0, x, y, 0);
        
}
public void step(ArrayList<AbstractMain> teamOpp, ArrayList<AbstractMain> teamMy) {
   if(hp > 0){stepLength = 0;}
   else{dead = 1;}
}
public String getInfo() {
    return (type +"="+name + "(" + coordinates.x +","+ coordinates.y + ")" + " " + "hp="+curHp);
    }
}