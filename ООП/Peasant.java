package ООП;

public class Peasant extends AbstractMain {
    
    public Peasant (String name, float coordinates_x, float coordinates_y){
        super(name, "Peasant", 30, 4, 2, 7, 5, 5, 4, coordinates_x, coordinates_y);
           
}
public void step() {
    System.out.println("where to plow");
}
public String getInfo() {
    return (type +"="+name + "(" + coordinates.x +","+ coordinates.y + ")");
    }
}