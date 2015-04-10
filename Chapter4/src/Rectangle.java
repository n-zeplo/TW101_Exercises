/**
 * Created by Nathan_Zeplowitz on 4/9/15.
 */
public class Rectangle {
    private double height = 1.0;
    private double width = 2.0;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double area(){
        return height * width;
    }

    public double perimeter(){
        return (2 * height) + (2 * width);
    }
}
