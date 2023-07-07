package ООП;

public class Priest extends AbstractMain {
    public float heal;
    public float mana;
    public float curMana;
    
    public Priest (String name, float coordinates_x, float coordinates_y){
        super(name, "Priest", 30, 2, 3, 4, 7, 6, 1, coordinates_x, coordinates_y);
        this.heal = 4;
        this.mana = this.curMana = 10;
           
    } 
    public void step() {
        System.out.println("who to save");
    }
    public String getInfo() {
        return (type +"="+name + "(" + coordinates.x +","+ coordinates.y + ")");
        }

}
