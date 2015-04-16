import java.util.ArrayList;

/**
 * Created by Nathan_Zeplowitz on 4/14/15.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Monster> monsters = new ArrayList<Monster>();

        Orc orc = new Orc();
        Troll troll = new Troll();

        monsters.add(orc);
        monsters.add(troll);

        for(Monster m: monsters) {
            m.takeDamage(10);
        }

        for (Monster m : monsters) {
            System.out.println(m.name() + " has taken damage and has " + m.currentHitpoints() + " hitpoints left.");
        }
    }
}
