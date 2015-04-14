/**
 * Created by Nathan_Zeplowitz on 4/14/15.
 */
public class RandomNumber {
    private int number;

    public RandomNumber(){
        this.number = (int) (Math.random() * 100);
    }

    public int getNumber() {
        return number;
    }
}
