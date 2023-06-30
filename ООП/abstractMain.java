package ООП;

public abstract class AbstractMain {
    public String name;
    public String type;
    public float hp;
    public float curHp;
    public float[] meleeDamage;
    public float defense;
    public float stepLength;
    public float radiusAttack;
    public float speed;
    public float evasion;

    public AbstractMain(String name, String type, float hp, float meleeDamage, float defense, float stepLength, float radiusAttack, float speed, float evasion){
        this.name = this.curHp = hp;
        this.type = type;
        this.radiusAttack = radiusAttack;
        this.hp = hp;
        this.meleeDamage = meleeDamage;
        this.defense = defense;
        this.stepLength = stepLength;
        this.speed = speed;
        this.evasion = evasion;
}
    @Override
    public String toString(){
        return name;
    }
}