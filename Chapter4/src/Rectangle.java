/**
 * Created by Nathan_Zeplowitz on 4/9/15.
 */
public class Rectangle {
    private double height = 1.0;
    private double width = 2.0;


    public Rectangle(double height, double width) {
        setHeight(height);
        setWidth(width);
    }

    public double area(){
        return getHeight() * getWidth();
    }

    public double perimeter(){
        return (2 * getHeight()) + (2 * getWidth());
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
