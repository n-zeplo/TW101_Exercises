/**
 * Created by Nathan_Zeplowitz on 4/9/15.
 */
public class Main {
    public static void main(String[] args) {
        double rectanglesTotalArea = 0;

        Rectangle [] rectangles = new Rectangle[5];

        for (int i = 0; i < 5; i++){
            rectangles[i] = new Rectangle();
        }

        for (int i = 0; i < rectangles.length; i++){
            rectanglesTotalArea += rectangles[i].area();
        }

        double rectanglesAverageArea = rectanglesTotalArea / rectangles.length;
        System.out.println("Total Area is " + rectanglesAverageArea);
    }
}
