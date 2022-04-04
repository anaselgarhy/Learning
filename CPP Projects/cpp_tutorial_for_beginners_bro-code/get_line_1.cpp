#include <iostream>
#include <string>

using namespace std;

int main() {

	string fullName;
	
	cout << "Please enterm your full name: ";
	getline(cin, fullName);

	cout << "Your full name is: " << fullName << endl;

	return 0;
}
