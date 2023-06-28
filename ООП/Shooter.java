package ООП;

public class Shooter extends AbstractMain {
    public float accuracy;
    public float rangedDamage;
    
    public Shooter (String name, String type, float hp, float meleeDamage, float defense, float stepLength, float radiusAttack, float speed, float evasion, float accuracy, float rangedDamage){
        super(name, type, hp, meleeDamage, defense, stepLength, radiusAttack, speed, evasion);
        this.accuracy = accuracy;
        this.rangedDamage = rangedDamage;
    } 
}
