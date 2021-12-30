package SixthExample;

public class Main {
    public static void main(String[] args){
        Book java_book = new Book("Java from \"print hello world\" to programming games", "Anas Elgarhy", 2024, 2000);
        java_book.open();
        if(java_book.moveToPage(208))
            System.out.println("Done");
        java_book.close();
        java_book.printInfo();
    }
}
