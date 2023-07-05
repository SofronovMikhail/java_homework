package ООП;

public class Mag extends AbstractMain{
    
    public float mana;
    public float rangedDamage;
    public float curMana;
    
    public Mag (String name, float coordinates_x, float coordinates_y){
        super(name, "Mag", 30, 3, 3, 4, 10, 4, 3, coordinates_x, coordinates_y);
        this.rangedDamage = -8;
        this.mana = this.curMana = 10;      
    } 
   
    public void step() {
        System.out.println("real magic");
    }
    public String getInfo() {
        return (type +"="+name + "(" + coordinates.x +","+ coordinates.y + ")");
        }
}
