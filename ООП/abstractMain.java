package ООП;

import java.util.ArrayList;
import java.util.List;

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
    Coordinates coordinates;
    
    
    public AbstractMain(String name, String type, float hp, float meleeDamage, float defense, float stepLength, float radiusAttack, float speed, float evasion, float x, float y){
        this.name = name;
        this.type = type;
        this.radiusAttack = radiusAttack;
        this.hp = this.curHp = hp;
        this.meleeDamage = meleeDamage;
        this.defense = defense;
        this.stepLength = stepLength;
        this.speed = speed;
        this.evasion = evasion;
        this.coordinates = new Coordinates(x, y);
    
}
    @Override
    public String toString(){
        return name;
    }

    private float leng(float x1, float y1, float x2, float y2){
        float leng = (float) Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        return leng;
      }

    public AbstractMain opponent(ArrayList<AbstractMain> team){
        float min = 11;
        AbstractMain opponent = team.get(0);
        for(int i = 0; i < team.size(); i++){
              if(min > leng(coordinates.x, coordinates.y, team.get(i).coordinates.x, team.get(i).coordinates.y)){
                 min = leng(coordinates.x, coordinates.y, team.get(i).coordinates.x, team.get(i).coordinates.y);
                opponent = team.get(i);
                }
          }
          return opponent;
    }

    public float length(ArrayList<AbstractMain> team){
        float min = 11;
        float opponent = 0;
        for(int i = 0; i < team.size(); i++){
              if(min > leng(coordinates.x, coordinates.y, team.get(i).coordinates.x, team.get(i).coordinates.y)){
                 min = leng(coordinates.x, coordinates.y, team.get(i).coordinates.x, team.get(i).coordinates.y);
                opponent = min;
                }
          }
          return opponent;
    }
     
    
}