package ООП;

public class Arbalester extends AbstractMain {
    public float accuracy;
    public float rangedDamage;
    
    public Arbalester (String name){
        super(name, "Arbalester", 40, -5, 5, 6, 9, 7, 5);
        this.accuracy = 7;
        this.rangedDamage = 7;
    } 
}
