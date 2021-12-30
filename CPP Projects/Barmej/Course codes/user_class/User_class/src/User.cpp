#include "User.h"

// Setters functions
void User::setUserName(string userName){
    User::userName = userName;
}
void User::setPassword(string password){
    User::password = password;
}
void User::setAge(short age){
    User::age = age;
}
void User::setGender(genderType gender){
    User::gender = gender;
}
// Getters functions
string User::getUserName(){
    return userName;
}
string User::getPassword(){
    return password;
}
short User::getAge(){
    return age;
}
string User::getGender(){
    return (gender == 0? "Male" : "Female");
}
