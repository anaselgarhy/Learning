#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include "functions.h"

void read_password(char passVar[]);
int validate(char userID[], char password[]);
void load_reseved_exams(char userID[]);

struct reservation_exam{
    int num;
    char user_code[20];
    char exam_code[20];
    char date[11];
    char name[64];
    int status;
};

int num_of_exams;

void main(void){

    char userID[20], password[20];
    printf("ID: ");
    scanf("%s", userID);
    printf("Password: ");
    read_password(password);
    if(validate(userID, password) == 1)
        load_reseved_exams(userID);
    else{
        printf("\n Invalid user id or password!\n");
        exit(0);
    }

}

void load_reseved_exams(char userID[])
{
    struct reservation_exam cur_rec;
    struct reservation_exam res_exams[7];

    FILE *fp = fopen("reservation_exam.txt", "r");

    char *field;
    int i=0;
    char line[200];
    int rec_no, field_no;

    if(fp == NULL)
    {
        printf("Can not open file!\n");
        exit(1);
    }

    rec_no=0;
    while(fgets(line, sizeof(line), fp) != NULL)
    {
        rec_no++;
        field = strtok(line, ",");
        field_no=0;
        while(field != NULL)
        {
            field_no++;
            switch(field_no)
            {
            case 1:
                cur_rec.num = atoi(field);
                break;
            case 2:
                strcpy(cur_rec.user_code, field);
                break;
            case 3:
                strcpy(cur_rec.date, field);
                break;
            case 4:
                strcpy(cur_rec.exam_code, field);
                break;
            case 8:
                cur_rec.status = atoi(field);
                break;
            }
            field = strtok(NULL, ",\n");

        }
        //cur_rec.name = get_exam_name(cur_rec.exam_code);
        if(strcmp(cur_rec.user_code,userID) == 0)
        {
            res_exams[i] = cur_rec;
            i++;
        }
    }
    num_of_exams=i;
    for(int j=0; j<num_of_exams; j++)
    printf("\nExam code: %6s\tExam date: %10s\tStatus: %-2d",res_exams[j].exam_code, res_exams[j].date, res_exams[j].status);
    fclose(fp);




}
