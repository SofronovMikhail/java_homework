package ООП;

public class Bandit extends AbstractMain{
    public float agility;
    
    public Bandit (String name, String type, float hp, float meleeDamage, float defense, float stepLength, float radiusAttack, float speed, float evasion, float agility){
        super(name, type, hp, meleeDamage, defense, stepLength, radiusAttack, speed, evasion);
        this.agility = agility;
           
    } 
}
