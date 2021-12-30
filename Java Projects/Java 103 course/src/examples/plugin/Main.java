package examples.plugin;

public class Main {
    public static void main(String[] args){
        PdfPlugin pdf = new PdfPlugin();
        Program.startPlugin(pdf);
        Program.executePlugin(pdf);
        Program.stopPlugin(pdf);
    }
}
