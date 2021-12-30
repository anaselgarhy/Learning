package polymorphism.example;

public class Main {
    public static void drawShape(Shape shape){
        shape.draw();
    }
    public static void main(String[] args){
        drawShape(new Circle());
        drawShape(new Triangle());
        drawShape(new Rectangle());
    }
}
