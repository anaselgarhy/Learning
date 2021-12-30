package examples.operatingSystem;

public class Windows extends OperatingSystem {
    public Windows(){
        super("Windows", "Unknown");
    }
    public Windows(String version){
        super("Windows", version);
    }
}
