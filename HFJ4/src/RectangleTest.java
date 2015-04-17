import junit.framework.TestCase;

import java.util.ArrayList;

public class RectangleTest extends TestCase {
    public void testRectLengthAndWidth(){
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals(1.0, rectangle.getHeight());
        assertEquals(2.0, rectangle.getWidth());
    }

    public void testRectangleArea(){
        Rectangle rectangle = new Rectangle(1, 87);
        assertEquals(87.0, rectangle.area());
    }

    public void testAverageArea(){
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>(2);
        rectangles.add(new Rectangle(4, 5));
        rectangles.add(new Rectangle(7, 9));
        double result = Rectangle.averageArea(rectangles);
        assertEquals(41.5, result);
    }

    public void testFillArray(){
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        rectangles = Rectangle.fillArray(rectangles, 7);
        assertEquals(7, rectangles.size());
    }

    public void testPerimeter(){
        Rectangle rectangle = new Rectangle(7, 10);
        assertEquals(34.0, rectangle.perimeter());
    }

    public void testTotalPerimeter(){
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>(2);
        rectangles.add(new Rectangle(4, 5));
        rectangles.add(new Rectangle(7, 9));
        assertEquals(50.0, Rectangle.totalPerimeter(rectangles));
    }


}