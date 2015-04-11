import java.util.Scanner;

/**
 * Created by Nathan_Zeplowitz on 4/11/15.
 */
public class DiamondWithName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DiamondWithName diamond = new DiamondWithName();

        System.out.println("Enter a number");
        int n = in.nextInt();
        diamond.printUpperHalf(n);
        System.out.println("Nathan");
        diamond.printLowerHalf(n);

    }

    protected void printUpperHalf(int n){
        for (int row = 1; row < n; row++) {
            String line = "";
            for (int spaces = 0; spaces < n - row; spaces++)
                line += " ";
            for (int stars = 1; stars < row * 2; stars++)
                line += "*";
            System.out.println(line);
        }
    }

    protected void printLowerHalf(int n){
        for (int row = n - 1; row >= 1; row--) {
            String line = "";
            for (int spaces = 0; spaces < n - row; spaces++)
                line += " ";
            for (int stars = 1; stars < row * 2; stars++)
                line += "*";
            System.out.println(line);
        }
    }
}
