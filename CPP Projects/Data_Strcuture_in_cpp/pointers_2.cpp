#include <iostream>

using namespace std;

int main() 
{
	int* ptr = new int(20);
	cout << *ptr << endl;
	delete ptr; // delete the pointer from the heap
	return 0;
}
