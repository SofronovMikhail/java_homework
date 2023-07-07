package ООП;


public class Bandit extends AbstractMain{
    public float agility;
    
    public Bandit (String name, float coordinates_x, float coordinates_y){
        super(name, "Bandit", 40, 7, 6, 4, 4, 5, 3, coordinates_x, coordinates_y);
        this.agility = 8;
           
    } 

    public void step() {
        System.out.println("die quickly");
    }
    public String getInfo() {
        return (type +"="+name + "(" + coordinates.x +","+ coordinates.y + ")");
        }
}
