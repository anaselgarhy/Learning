package abstract1.shape;

public abstract class Shape {
    private String name;
    public Shape(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public abstract void draw();
}
