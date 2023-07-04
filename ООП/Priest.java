package ООП;

public class Priest extends AbstractMain {
    public float heal;
    public float mana;
    public float curMana;
    
    public Priest (String name, float coordinates){
        super(name, "Priest", 30, 2, 3, 4, 7, 5, 2, coordinates);
        this.heal = 4;
        this.mana = this.curMana = 10;
           
    } 
    public void step() {
        System.out.println("who to save");
    }
    public String getInfo() {
        return (type +"="+name);
        }

}
