/**
 * Created by Nathan_Zeplowitz on 4/1/15.
 */
public class Incrementer {

    private int timesIncrementCalled = 0;

    public void increment(){
        timesIncrementCalled++;
    }

    public void total(){
        System.out.println(timesIncrementCalled);
    }
}
