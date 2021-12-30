package SixthExample;

public class Book {
    public String name, author;
    public int publishDate;

    public int lastPageNumber;
    public int currentPage;

    boolean isOpen;

    public Book(String name, String author, int publishDate, int lastPageNumber){
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
        this.lastPageNumber = lastPageNumber;
        this.isOpen = false;
    }

    public void open(){
        if (isOpen)
            System.out.println("is open!");
        else
            isOpen = true;
    }
    public void close(){
        if(isOpen)
            isOpen = false;
        else
            System.out.println("is close!");
    }
    public boolean moveToPage(int pageNumber){
        if(!isOpen)
            return false;
        else if(pageNumber > lastPageNumber || pageNumber < 1)
            return false;
        else{
            currentPage = pageNumber;
            return true;
        }
    }
    public void printInfo(){
        System.out.println("Book name: " + this.name + '\n' +
                           "Book author: " + this.author + '\n' +
                           "Publish date: " + this.publishDate + '\n' +
                           "Number of pages: " + this.lastPageNumber
        );
    }
}
