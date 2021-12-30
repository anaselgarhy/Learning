#include <iostream>
int main(void)
{
		int x = 10, y = 20, *ptr1;
		int **ptr2 = &ptr1; //Pointer refer to pointer // See here
		int ***ptr3 = &ptr2; //Pointer refer to pointer refer to pointer // See here
		int ****ptr4 = &ptr3; //Pointer refer to pointer refer to pointer refer to pointer // See here
		int *****ptr5 = &ptr4; //Pointer refer to pointer refer to pointer refer to pointer refer to pointer// See here
		std::cout << x*y << std::endl; // Print 200
		ptr1 = &y;
		std::cout << x**ptr1 << std::endl; // Print 200 // the first asterisk to multiple
		std::cout << x***ptr2 << std::endl; // Print 200 // the first asterisk to multiple
		std::cout << x****ptr3 << std::endl; // Print 200 // the first asterisk to multiple
		std::cout << x*****ptr4 << std::endl; // Print 200 // the first asterisk to multiple
		std::cout << x******ptr5 << std::endl; // Print 200 // the first asterisk to multiple
		return 0;
}
