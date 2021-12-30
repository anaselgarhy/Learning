package examples.plugin;

public class Program {
    public static void startPlugin(Plugin p){
        p.start();
    }
    public static void executePlugin(Plugin p){
        p.execute();
    }
    public static void stopPlugin(Plugin p){
        p.stop();
    }
}
