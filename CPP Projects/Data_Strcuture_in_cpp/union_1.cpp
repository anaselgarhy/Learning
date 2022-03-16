#include <iostream>

using namespace std;

union Box {
	double weight;
	double height;
};

int main() 
{
	Box box;
	box.weight = 10.0;
	box.height = 20.0;
	cout << "box.weight = " << box.weight << endl;
	cout << "box.height = " << box.height << endl;
	return 0;
}
