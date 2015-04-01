/**
 * Created by Nathan_Zeplowitz on 4/1/15.
 */
public class SumOdd {

    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < 100; i++){
            if (isOdd(i)){
                sum += i;
            }
        }
        System.out.println(sum);
    }

    private static boolean isOdd(int i) {
        return i % 2 != 0;
    }
}


