#include <stdio.h>
#include <stdlib.h>

typedef enum Gender
{
    Male=1, Female=2
}Gender;
typedef enum Skill
{
    Bad=1,Normal=2,Proffessional=3
}Skill;
typedef struct Person
{
    char *name;
    Gender gender;
    Skill skill;
}Person;
int main(int argc, char *argv[]) {
    Person p;

    char name[60];
    printf("Your Name : ");
    scanf("%s",name);

    int gender;
    printf("1. Male \t 2. Female\n");
    printf("Your gender : ");
    scanf("%d",&gender);

    int skill;
    printf("Skill \n");
    printf("1.Bad    2. Normal    3. Proffessional\n");
    scanf("%d",&skill);
    p.name=name;
    p.gender=gender;
    p.skill=skill;
    if(p.gender==Male)
    {
        printf("Hello mr.%s\n",p.name);
    }
    else
    {
        printf("Hello ms.%s\n",p.name);
    }
	return 0;
}




