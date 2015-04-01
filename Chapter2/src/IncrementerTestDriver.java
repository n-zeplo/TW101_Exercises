/**
 * Created by Nathan_Zeplowitz on 4/1/15.
 */
public class IncrementerTestDriver {
    public static void main(String[] args){
        Incrementer incrementer = new Incrementer();

        for(int i = 0; i < 5; i++){
            incrementer.increment();
        }

        incrementer.total();
    }
}
