package examples.operatingSystem;

public class Linux extends OperatingSystem {
    String dist;
    public Linux(){
        super("Linux", "Unknown");
    }
    public Linux(String dist, String version){
        super("Linux", version);
        this.dist = dist;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Distribution: " + dist);
    }
}
