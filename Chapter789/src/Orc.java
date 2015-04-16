/**
 * Created by Nathan_Zeplowitz on 4/14/15.
 */
public class Orc implements Monster {
    private int currentHitpoints;

    public Orc(){
        this.currentHitpoints = 20;
    }

    public Orc(int hitpoints) {
        this.currentHitpoints = hitpoints;
    }

    public void takeDamage(int amount){
        this.currentHitpoints -= amount;
    }

    public String name(){
        return "Orc";
    }

    public int currentHitpoints(){
        return currentHitpoints;
    }
}
