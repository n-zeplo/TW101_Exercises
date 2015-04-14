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

    public String checkGuess(String userGuess) {
        int guess = Integer.parseInt(userGuess);

        if (guess == getNumber()) {
            return "Correct";
        } else if (guess < getNumber()) {
            return "Your guess was too low.";
        } else {
            return "Your guess was too high.";
        }
    }
}
