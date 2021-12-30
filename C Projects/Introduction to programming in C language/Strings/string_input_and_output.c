#include<stdio.h>

void main(void){

    char name[25];

    //Input
    printf("Please enter name: ");
    gets(name);

    //output
    printf("Hello ,");
    puts(name);

    printf("Length of %s is: %d\n",name,str_len(name));

    if(palind_rom(name))
        printf("%s is palindrome\n",name);
    else
        printf("%s not palindrome\n",name);


}
int str_len(char a[]){
    int i =0;
    while(a[i] != '\0')
        i++;
    return i;
}
int palind_rom(char a[]){

    int n=str_len(a);
    int i;
    short int pa =1;

    for(i=0; i<n/2; i++)
        if(a[i] != a[n-1-i]){
            pa=0;
            break;
        }
    return pa;
}


















