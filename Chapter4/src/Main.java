/**
 * Created by Nathan_Zeplowitz on 4/9/15.
 */
public class Main {
    public static void main(String[] args) {
        double rectanglesTotalArea = 0;
        double rectanglesTotalPerimeter = 0;

        Rectangle [] rectangles = new Rectangle[5];

        for (int i = 0; i < 5; i++){
            rectangles[i] = new Rectangle(1.0, 2.0);
        }

        for (int i = 0; i < rectangles.length; i++){
            rectanglesTotalArea += rectangles[i].area();
            rectanglesTotalPerimeter += rectangles[i].perimeter();
        }

        System.out.println("Rectangles' total area is " + rectanglesTotalArea);
        System.out.println("Rectangles' total perimeter is " + rectanglesTotalPerimeter);
    }
}
