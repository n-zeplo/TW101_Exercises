import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Nathan_Zeplowitz on 4/11/15.
 */
public class PrimeFactors {
    public static void main(String[] args) {
        PrimeFactors primeFactors = new PrimeFactors();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = in.nextInt();
        primeFactors.generate(n);
    }

    private void generate(int n) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }
        for (int i = 0; i < primeFactors.size(); i++) {
            if (i == primeFactors.size() - 1) {
                System.out.print(primeFactors.get(i));
            } else {
                System.out.print(primeFactors.get(i) + ",");
            }
        }
    }
}
