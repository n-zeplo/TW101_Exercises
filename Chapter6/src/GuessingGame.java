/**
 * Created by Nathan_Zeplowitz on 4/14/15.
 */
public class GuessingGame {
    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();
        GameHelper helper = new GameHelper();
        boolean guessCorrect = false;

        while(!guessCorrect){
            String userGuess = helper.getUserInput("Guess a Number Between 1 and 100:");
            String result = checkGuess(userGuess, randomNumber);

            if (result.equals("Correct")) {
                guessCorrect = true;
                System.out.println("Your guess was correct. You Win!");
                break;
            }

            System.out.println(result);

        }
    }

    public static String checkGuess(String userGuess, RandomNumber randomNumber) {
        int guess = Integer.parseInt(userGuess);

        if (guess == randomNumber.getNumber()) {
            return "Correct";
        } else if (guess < randomNumber.getNumber()) {
            return "Your guess was too low.";
        } else {
            return "Your guess was too high.";
        }
    }


}
