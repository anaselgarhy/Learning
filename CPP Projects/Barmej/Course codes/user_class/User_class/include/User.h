#include <iostream>
using namespace std;
#ifndef USER_H
#define USER_H
typedef enum genderType{
    Male,
    Female
};
class User
{
private:
    string userName, password;
    short age;
    genderType gender;
public:

    // setters functions
    void setUserName(string);
    void setPassword(string);
    void setAge(short);
    void setGender(genderType);
    // getters functions
    string getUserName();
    string getPassword();
    short getAge();
    string getGender();
};

#endif // USER_H
