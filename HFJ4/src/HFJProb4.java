import java.util.ArrayList;

/**
 * Created by Chandni on 4/5/15.
 */
public class HFJProb4 {
    public static void main(String[] args){
        int numberOfRectangles = 5;
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        rectangles = Rectangle.fillArray(rectangles, numberOfRectangles);
        double totalPerimeter = Rectangle.totalPerimeter(rectangles);
        System.out.print(totalPerimeter);
    }
}
