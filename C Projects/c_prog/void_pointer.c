#include <stdio.h>

int main(void) 
{
	int int_num = 7;
	float float_num = 3.14;
	char _char = 'a';
    long long_num = 123456789;

	void *generic_pointer = &int_num;
	printf("%d\n", *(int *)generic_pointer);
	generic_pointer = &float_num;
	printf("%f\n", *(float *)generic_pointer);
	generic_pointer = &_char;
	printf("%c\n", *(char *)generic_pointer);
	generic_pointer = &long_num;
	printf("%lld\n", *(long long *)generic_pointer);
	return 0;
}
