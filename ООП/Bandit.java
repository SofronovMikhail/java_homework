package ООП;


public class Bandit extends AbstractMain{
    public float agility;
    
    public Bandit (String name){
        super(name, "Bandit", 40, 7, 6, 4, 4, 7, 7);
        this.agility = 8;
           
    } 

    public void step() {
        System.out.println("die quickly");
    }
    public String getInfo() {
        return (type +"="+name);
        }
}
