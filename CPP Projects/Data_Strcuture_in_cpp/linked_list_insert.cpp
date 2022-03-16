#include <iostream>

using namespace std;

struct Node {
	int data;
	Node* next;
};

Node* head = NULL;

void insert(int);

int main() 
{
	insert(1);
	insert(2);
	insert(3);
	insert(4);
	return 0;
}

void insert(int data) 
{
	Node* newNode = new Node;
	newNode -> data = data;

	if (head == NULL) {
		head = newNode;
		newNode -> next = NULL;
	} else {
		Node* temp = head;
		while (temp -> next != NULL) {
			temp = temp -> next;
		}
		temp -> next = newNode;
		newNode -> next = NULL;
	}
}
