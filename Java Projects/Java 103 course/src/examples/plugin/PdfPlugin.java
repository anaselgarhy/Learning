package examples.plugin;

public class PdfPlugin implements Plugin {

    @Override
    public void start() {
        System.out.println("Start pdf plugin");
    }

    @Override
    public void execute() {
        System.out.println("Execute ...");
    }

    @Override
    public void stop() {
        close();
    }
    private void close(){
        System.out.println("Closed");
    }
}
