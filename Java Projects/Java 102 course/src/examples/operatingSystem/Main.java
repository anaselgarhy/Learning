package examples.operatingSystem;

public class Main {
    private static void printOs(OperatingSystem os){
        os.printInfo();
    }
    public static void main(String[] args){
        Windows win7 = new Windows("7");
        Mac lion = new Mac("Lion");
        Linux linux = new Linux("Fedora", "10");
        printOs(win7);
        printOs(lion);
        printOs(linux);
    }
}
