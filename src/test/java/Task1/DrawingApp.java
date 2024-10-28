package Task1;

public class DrawingApp {
    public static void startDrawing(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        DrawingApp.startDrawing(circle);
        DrawingApp.startDrawing(rectangle);
        DrawingApp.startDrawing(triangle);
    }
}
