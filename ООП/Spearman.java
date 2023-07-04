package ООП;

public class Spearman extends AbstractMain{
    public float endurance;
    
    public Spearman (String name, float coordinates){
        super(name, "Spearman", 50, 8, 8, 5, 5, 5, 4, coordinates);
        this.endurance = 8;
           
    } 
    public void step() {
        System.out.println("who's on me");
    }
    public String getInfo() {
        return (type +"="+name);
        }
}
