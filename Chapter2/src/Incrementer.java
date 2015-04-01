/**
 * Created by Nathan_Zeplowitz on 4/1/15.
 */
public class Incrementer {

    private int timesIncrementCalled = 0;

    public static void Main(String[] args){

    }

    public void increment(){
        timesIncrementCalled++;
    }

    public void total(){
        System.out.println(timesIncrementCalled);
    }
}
