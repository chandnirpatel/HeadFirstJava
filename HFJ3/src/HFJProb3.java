import java.util.ArrayList;


public class HFJProb3 {
    public static void main(String[] args){
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        rectangles = Rectangle.fillArray(rectangles, 5);
        double averageArea = Rectangle.averageArea(rectangles);
    }
}
