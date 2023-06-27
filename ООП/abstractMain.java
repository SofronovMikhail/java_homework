package ООП;

public class abstractMain {
    public String name;
    public String type;
    public float hp;
    public float meleeDamage;
    public float defense;
    public float stepLength;
    public float radiusAttack;
    public float speed;
    public float evasion;

    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public boolean setHp(float hp){
        if(hp == 0){
            return false;
        }
        this.hp = hp;
        return true;
    }
    public boolean setstepLength(float hp, float stepLength){
        if(hp > 0 && hp <= 5){
            this.stepLength = (float) (stepLength / 0.3);
            return false;
        }
        this.stepLength = stepLength;
        return true;
    }
    public boolean setEvasion(float hp, float evasion){
        if(hp > 0 && hp <= 5){
            this.evasion = (float) (evasion / 0.3);
            return false;
        }
        this.evasion = evasion;
        return true;
    }
    public boolean setSpeed(float hp, float speed){
        if(hp > 0 && hp <= 5){
            this.speed = (float) (speed / 0.3);
            return false;
        }
        this.speed = speed;
        return true;
    }
    public boolean setMeleeDamage(float hp, float meleeDamage){
        if(hp > 0 && hp <= 5){
            this.meleeDamage = (float) (meleeDamage * 0.3);
            return false;
        }
        this.meleeDamage = meleeDamage;
        return true;
    }
    public boolean setDefense(float hp, float defense){
        if(hp > 0 && hp <= 5){
            this.defense = (float) (defense * 0.3);
            return false;
        }
        this.defense = defense;
        return true;
    }

    public abstractMain(String name, String type, float hp, float meleeDamage, float defense, float stepLength, float radiusAttack, float speed, float evasion){
        this.name = name;
        this.type = type;
        setstepLength(hp, stepLength);
        setEvasion(hp, evasion);
        setSpeed(hp, speed);
        setMeleeDamage(hp, meleeDamage);
        setDefense(hp, defense);
    }

}
