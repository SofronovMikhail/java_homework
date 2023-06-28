package ООП;

public class Priest extends AbstractMain {
    public float heal;
    public float religion;
    
    public Priest (String name, String type, float hp, float meleeDamage, float defense, float stepLength, float radiusAttack, float speed, float evasion, float heal, float religion){
        super(name, type, hp, meleeDamage, defense, stepLength, radiusAttack, speed, evasion);
        this.heal = heal;
        this.religion = religion;
           
    } 
}
