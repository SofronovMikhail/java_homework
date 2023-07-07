package ООП;

public class Spearman extends AbstractMain{
    public float endurance;
    
    public Spearman (String name, float coordinates_x, float coordinates_y){
        super(name, "Spearman", 50, 8, 8, 5, 5, 4, 1, coordinates_x, coordinates_y);
        this.endurance = 8;
           
    } 
    public void step() {
        System.out.println("who's on me");
    }
    public String getInfo() {
        return (type +"="+name + "(" + coordinates.x +","+ coordinates.y + ")");
        }
}
