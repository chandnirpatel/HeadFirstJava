import java.util.ArrayList;


public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return  width;
    }

    public double area() {
        return height * width;
    }

    public static ArrayList<Rectangle> fillArray(ArrayList<Rectangle> rectangles, int desiredSize) {
        for(int numberOfRectangles = 0; numberOfRectangles < desiredSize; numberOfRectangles++){
            rectangles.add(new Rectangle((numberOfRectangles + 1)*Math.random(), (numberOfRectangles + 1)*Math.random()));
        }
        return rectangles;
    }

    public static double averageArea(ArrayList<Rectangle> rectangles) {
        double totalArea = 0.0;
        for (Rectangle rectangle : rectangles){
            totalArea += rectangle.area();
        }
        return  totalArea/rectangles.size();
    }
}
