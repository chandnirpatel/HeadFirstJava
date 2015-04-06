import java.util.ArrayList;

/**
 * Created by Chandni on 4/4/15.
 */

public class Rectangle {
    public double height;
    public double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double area() {
        return height * width;
    }

    public static ArrayList<Rectangle> fillArray(ArrayList<Rectangle> rectangles, int desiredSize) {
        for(int i = 0; i < desiredSize; i++){
            rectangles.add(new Rectangle((i + 1)*Math.random(), (i + 1)*Math.random()));
        }
        return rectangles;
    }

    public static double averageArea(ArrayList<Rectangle> rectangles) {
        double totalArea = 0.0;
        for (Rectangle r : rectangles){
            totalArea += r.area();
        }
        return  totalArea/rectangles.size();
    }
}