package ООП;

public class Peasant extends AbstractMain {
    
    public Peasant (String name, float coordinates){
        super(name, "Peasant", 30, 4, 2, 7, 5, 5, 4, coordinates);
           
}
public void step() {
    System.out.println("where to plow");
}
public String getInfo() {
    return (type +"="+name);
    }
}