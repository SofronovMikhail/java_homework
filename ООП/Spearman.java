package ООП;

public class Spearman extends AbstractMain{
    public float endurance;
    
    public Spearman (String name, String type, float hp, float meleeDamage, float defense, float stepLength, float radiusAttack, float speed, float evasion, float endurance){
        super(name, type, hp, meleeDamage, defense, stepLength, radiusAttack, speed, evasion);
        this.endurance = endurance;
           
    } 
}
