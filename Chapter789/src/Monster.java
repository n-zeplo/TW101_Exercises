/**
 * Created by Nathan_Zeplowitz on 4/14/15.
 */
interface Monster {
    public abstract void takeDamage(int amount);
    public abstract String name();
    public abstract int currentHitpoints();
}
