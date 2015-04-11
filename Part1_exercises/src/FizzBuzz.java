/**
 * Created by Nathan_Zeplowitz on 4/11/15.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.FizzBuzz();
    }

    public void FizzBuzz(){
        for (int i = 0; i <= 100; i++) {
            if((i % 5 == 0) && (i % 3 == 0)){
                System.out.println("FizzBuzz");
            } else if((i % 3 == 0)) {
                System.out.println("Fizz");
            } else if((i % 5 == 0)){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
