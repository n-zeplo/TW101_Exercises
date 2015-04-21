/**
 * Created by Nathan_Zeplowitz on 4/14/15.
 */
public class Troll implements Monster {
    private int currentHitpoints;

    public Troll(){
        this.currentHitpoints = 40;
    }

    public void takeDamage(int amount){
        currentHitpoints -= (amount / 2);
    }

    public String name(){
        return "Troll";
    }

    public int currentHitpoints(){
        return currentHitpoints;
    }
}
