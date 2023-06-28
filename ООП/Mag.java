package ООП;

public class Mag extends AbstractMain{
    
    public float mana;
    public float rangedDamage;
    
    public Mag (String name, String type, float hp, float meleeDamage, float defense, float stepLength, float radiusAttack, float speed, float evasion, float mana, float rangedDamage){
        super(name, type, hp, meleeDamage, defense, stepLength, radiusAttack, speed, evasion);
        this.rangedDamage = rangedDamage;
        this.mana = mana;
           
    } 
}
