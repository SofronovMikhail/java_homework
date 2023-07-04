package ООП;

public class Mag extends AbstractMain{
    
    public float mana;
    public float rangedDamage;
    public float curMana;
    
    public Mag (String name, float coordinates){
        super(name, "Mag", 30, 3, 3, 4, 10, 4, 3, coordinates);
        this.rangedDamage = -8;
        this.mana = this.curMana = 10;      
    } 
   
    public void step() {
        System.out.println("real magic");
    }
    public String getInfo() {
        return (type +"="+name);
        }
}
