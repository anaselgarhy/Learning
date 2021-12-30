package abstract1.shape;
public class Main {
    private static Shape getShape(){
        return new Rectangle();
    }
    private static void drawShape(Shape shape){
        if(shape instanceof Rectangle) // Look here
            System.out.println("R");
        else if(shape instanceof Circle) // Look here
            System.out.println("C");
    }
    public static void main(String[] args){
        Circle circle = new Circle();
        Shape s = circle; // Look here
        Shape x = new Rectangle(); // Look here
        drawShape(s);
        drawShape(x);
        drawShape(circle);
    }
}
