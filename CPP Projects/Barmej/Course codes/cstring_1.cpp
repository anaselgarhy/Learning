#include <iostream>
#include <cstring>
using namespace std;

int main(void)
{
    // strcpy
    char name[] = "Anas";
    char nameCopy[20];
    strcpy(nameCopy, name);
    cout << nameCopy << endl;
    // strncpy
    char nameNcopy[3];
    strncpy(nameNcopy, name, 2);
    nameNcopy[2] = '\0';
    cout << nameNcopy << endl;
    // strcat
    char firstName[20] = "Anas ";
    char lastName[20] = "Elgarhy";
    strcat(firstName, lastName);
    cout << firstName << endl;
    // strcmp
    char str1[10] = "anas";
    char str2[10] = "anas";
    if(strcmp(str1, str2) == 0)
        cout << "two identical texts" << endl;
    // strncmp
    char string1[5] = "Anas";
    char string2[20] = "Anas Ahmed Elgarhy";
    if(strncmp(string1, string2, 4) == 0)
        cout << "Anas" << endl;
    // strlen
    char str[] = "Anas Ahmed Mohmed Elgarhy";
    cout << strlen(str) << endl;



    return 0;
}
