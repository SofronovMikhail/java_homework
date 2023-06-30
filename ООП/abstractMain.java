package ООП;

public abstract class AbstractMain implements Interface{
    public String name;
    public String type;
    public float hp;
    public float curHp;
    public float meleeDamage;
    public float defense;
    public float stepLength;
    public float radiusAttack;
    public float speed;
    public float evasion;

    public AbstractMain(String name, String type, float hp, float meleeDamage, float defense, float stepLength, float radiusAttack, float speed, float evasion){
        this.name = name;
        this.type = type;
        this.radiusAttack = radiusAttack;
        this.hp = this.curHp = hp;
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