package ООП;

public class Shooter extends AbstractMain {
    public float accuracy;
    public float rangedDamage;
    public int arrows;
    public Shooter (String name, float coordinates_x, float coordinates_y){
        super(name, "Shooter", 40, 5, 5, 4, 10, 3, 2, coordinates_x, coordinates_y);
        this.accuracy = 9;
        this.rangedDamage = 6;
        this.arrows = 5;
    } 
    public void step() {
        System.out.println("Headshot");
    }
    public String getInfo() {
        return (type +"="+name + "(" + coordinates.x +","+ coordinates.y + ")");
        }
}
