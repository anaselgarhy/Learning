#include <iostream>

using namespace std;

struct Book {
	string name;
	string author;
	int pages_number;
	float price;
};

void printBook(Book book) 
{
	cout << "Book name: " << book.name << endl;
	cout << "Book author: " << book.author << endl;
	cout << "Book pages number: " << book.pages_number << endl;
	cout << "Book price: " << book.price << endl;
}

int main() 
{
	Book book1;
	book1.name = "Harry Potter";
	book1.author = "J.K. Rowling";
	book1.pages_number = 400;
	book1.price = 20.00f;
	
	cout << "<------------------Book 1------------------>" << endl;
	printBook(book1);
    Book book2 = { "The Lord of the Rings", "J.R.R. Tolkien", 700, 30.00f };
	
	cout << "<------------------Book 2------------------>" << endl;
	printBook(book2);
	return 0;
}
