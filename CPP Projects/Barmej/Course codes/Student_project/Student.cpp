#include "Student.h"
Student::Student(string name, short grade)
{
    setName(name);
    setGrade(grade);
}
void Student::setName(string n)
{
    name = n;
}
void Student::setGrade(short g)
{
    grade = (g <= 100 && g >=0)? g:grade;
}
string Student::pass()
{
    return (grade >= 60)? "True":"False";
}
void Student::printStatus()
{
    cout << "Student name: " << name << endl
         << "Student grade: " << grade << endl
         << "Student pass: " << pass() << endl;
}