#include <iostream>
#include <string>

using namespace std;

int main() {
	string item;
	double price;
	int quantity;
	double total;

	cout << "What is the item that you want bay? ";
	getline(cin, item);

	cout << "What is the price of the item? ";
	cin >> price;

	cout << "How many of the item do you want to buy? ";
	cin >> quantity;

	total = price * quantity;

	cout << "The total price of the item is " << total << endl;

	return 0;
}
