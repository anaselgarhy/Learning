#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

typedef struct Supject
{
  char *name;
  int mark;
}Supject;
typedef struct Student
{
    char *name;
    int age;
    int grade;
    char section;
    Supject supjects[4];
}Student;
Student *students;
int studentsCounter=0;
Student createStudent(char *name,  int age, int grade, char section);

void addStudent(Student st);
void printStudentInfo(Student info);
void addInitialSubjectsToStudent(Student *st);
void addGredesNow(char *studenName);

void userEnterfase1();
void userEnterfase2();

int findStudent(const char *name);
void editStudentGrades(int studentNo, int userChoice, int grade);

void case1();
void case2();
void case3();

int main(int argc, char** argv) {

    do{
        int input1;
        userEnterfase1();
        scanf("%d",&input1);
        switch(input1)
        {
        case 1:
            case1();
        break;
        case 2:
            case2();
        break;
        case 3:
        case3();
        break;
        default:
            printf("Error choose ! \n");
            break;
        }


    }while(1);
    return 0;
}
//اضافة طالب الي المؤشر *Students
void addStudent(Student st)
{
    studentsCounter++;
    students = (Student *)realloc(students, sizeof(Student) * studentsCounter);
    students[studentsCounter-1]=st;
}
//تقوم هذه الدالة بانشاء طالب جديد
Student createStudent(char *name,  int age, int grade, char section)
{
    Student st;
    st.name=name;
    st.age= age;
    st.grade= grade;
    st.section= section;

    addInitialSubjectsToStudent(&st);
    return st;
}
//الدرجات
void addInitialSubjectsToStudent(Student *st)
{
        Supject arabic, math, science, islamic;

    arabic.name="Arabic";
    arabic.mark=0;

    math.name="Math   ";
    math.mark=0;

    science.name="Science";
    science.mark=0;

    islamic.name="Islamic";
    islamic.mark=0;

    st->supjects[0]=arabic;
    st->supjects[1]=math;
    st->supjects[2]=science;
    st->supjects[3]=islamic;
}
//تقوم هذه الدالي بطباعة معلومات طالب
void printStudentInfo(Student info)
{
    printf("Name : %s \n",info.name);
    printf("Age : %d \n",info.age);
    printf("Grade : %d \n",info.grade);
    printf("Section : %c \n",info.section);
    //طباعة المواد
    printf("No    Subject \t Grade \n");
    for(int i=0; i<4; i++)
    {
        printf("%d    %s \t   %d \n", i+1, info.supjects[i].name, info.supjects[i].mark);
    }
}
void userEnterfase1()
{
    printf("----------------Welcome----------------- \n");
    printf("Choose the operation you want to perform : \n");
    printf("1. Insert student information \n");
    printf("2. Search for a student  \n");
    printf("3. Adjusting student grades \n");
}
//الخيار الاول :اضافة طالب جديد
void case1()
{
    char *studentName=(char *)malloc(60);
     int age ,grade;
      char section,input2;

       printf("Enter the student's name : ");
            scanf("%s",studentName);
         printf("Enter the student's age : ");
            scanf("%d",&age);
           printf("Enter the student's grade : ");
                scanf("%d",&grade);
           printf("Enter the student's section : ");
                scanf(" %c",&section);
          Student st=createStudent(studentName, age, grade, section);
          addStudent(st);
        printf("Do you want to add grades of student %s now? y/n\n",studentName);
        scanf(" %c",&input2);
        if(input2=='y')
         {
          addGredesNow(studentName);
          }

          printf("Done ^_^ \n");
}
void addGredesNow(char *studenName)
{
    int stNo=findStudent(studenName);
    for(int i=0; i<4;i++)
    {
        int grade;
        printf("Grade %s : ",students[stNo].supjects[i].name);
        scanf("%d",&grade);
        editStudentGrades(stNo,i,grade);
    }
}
//الخيار الثاني : البحث عن طالب
int findStudent(const char *name)
{
    for(int i=0; i<studentsCounter; i++)
    {
        if(strcmp(name, students[i].name)==0)
        {
            return i;
        }
            printf("The student was not found, %s \n",name);
            return -1;
    }
}
void case2()
{
    printf("Enter the name of the student you want to search for :\n");
    char *studentName=(char *)malloc(60);
    scanf("%s",studentName);
    int stNo=findStudent(studentName);
    printStudentInfo(students[stNo]);
}
//الخيار الثالث:تعديل درجات طالب
void userEnterfase2()
{
    printf("\n##################\n");
    printf("Choose the material whose tags you want to edit :\n");
    printf("1. Arabic \t");
    printf("2. Math \n");
    printf("3. Science \t");
    printf("4. Islamic \n");
}
void editStudentGrades(int studentNo, int userChoice, int grade)
{
    students[studentNo].supjects[userChoice].mark = grade;
}
void case3()
{
    printf("############################\n");
    printf("Enter the name of the student whose grades you want to change \n");
    char *studentName = (char *)malloc(60);
    scanf("%s",studentName);

    int stNo=findStudent(studentName);
    printStudentInfo(students[stNo]);
    if(stNo==-1)
    {
        return;
    }
    int choice;
    do
    {
        userEnterfase2();
        scanf("%d",&choice);
        if(choice>=1 && choice<=4)
        {
            int newGrade;
            printf("Enter the new grade : ");
            scanf("%d",&newGrade);
            editStudentGrades(stNo,choice-1,newGrade);
            printf("Done ^_^ \n");
        }
        else if(choice==-1)
        {
            return;
        }
        else
        {
            printf("Wrong Choice You can type -1 to return \n");
        }
    }while(choice!=-1);
}
