#include <iostream>
using namespace std;
#ifndef STUDENT_H
#define STUDENT_H
class Student
{
private:
    string name;
    short grade;
public:
    Student(string name, short grade);
    void setName(string n);
    void setGrade(short g);
    string pass();
    void printStatus();
};
#endif // STUDENT_H
