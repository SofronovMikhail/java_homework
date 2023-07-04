package ООП;

public class Arbalester extends AbstractMain {
    public float accuracy;
    public float rangedDamage;
    
    public Arbalester (String name, float coordinates){
        super(name, "Arbalester", 40, 3, 5, 6, 9, 7, 5, coordinates);
        this.accuracy = 7;
        this.rangedDamage = 7;
    } 

public void step() {
    System.out.println("who needs bolts");
}

public String getInfo() {
    return (type +"="+name);
    }
    
}

