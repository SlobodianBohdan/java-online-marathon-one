// Create classes Square and Rectang with method (double getPerimeter()) for calculating of perimeter.
// Find solution for avoiding of duplicate code.
// Create a double sumPerimeter(List<?> firures) method of the MyUtils class to return a sum perimeters of all figures.
// For example, for a given list
// [[Square [width=4.00], Square [width=5.00], Rectang [height=2.00, width=3.00]]
// you should get 46

import java.util.ArrayList;
import java.util.List;

abstract class Figure {
    abstract double getPerimeter();
}
class Rectang extends Figure{
    // Code
    private double height;
    private double width;

    public double getPerimeter() {
        return getHeight() * 2 + getWidth() * 2;
    }

    public Rectang(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

}
class Square extends Figure{
    // Code
    private double width;


    public double getPerimeter() {
        return getWidth() * 4;
    }


    public double getWidth() {
        return width;
    }

    public Square(double width) {
        this.width = width;
    }

}
class MyUtils {
    public double sumPerimeter(List<Figure> figures) {
        double  sumPerimeter = 0;
        for (Figure f : figures) {
            if (f == null){
                continue;
            }
            sumPerimeter =  sumPerimeter + f.getPerimeter();
        }
        return  sumPerimeter;
    }
}
