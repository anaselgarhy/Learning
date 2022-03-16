#include <iostream>

using namespace std;

int main() 
{
	int a = 20;

	cout << "Address of a: " << &a << endl;

	int* ptr = &a;
	cout << "ptr refers to: " << *ptr << endl;

	*ptr = 30;
	cout << "Value of a is now: " << a << endl;
	return 0;
}
