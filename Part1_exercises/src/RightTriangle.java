import java.util.Scanner;

/**
 * Created by Nathan_Zeplowitz on 4/11/15.
 */
public class RightTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String line = "*";
            for (int j = 0; j < i; j++) {
                line += "*";
            }
            System.out.println(line);
        }

    }

}
