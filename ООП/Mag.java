package ООП;

public class Mag extends AbstractMain{
    
    public float mana;
    public float rangedDamage;
    public float curMana;
    
    public Mag (String name){
        super(name, "Mag", 30, -3, 3, 4, 10, 4, 3);
        this.rangedDamage = -8;
        this.mana = this.curMana = 10;
           
    } 
}
