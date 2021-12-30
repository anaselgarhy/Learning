

void read_password(char passVar[])
{
    char ch;
    int i=0;
    while((ch = getch()) != 13)
    {
        //to ignore function keys and arrows keys
        if(ch ==0|| ch ==-32)
        {
            getch();
            continue;
            printf("\a");
        }
        if(ch == 8) //backspace
        {
            if(i>0){
                printf("\b \b");
                i--;
            }
        }
        else
            if(ch>=32&&ch<=126)
            {
                passVar[i++] = ch;
                printf("*");
            }
            else
                printf("\a");
    }

    // set end of string
    passVar[i]='\0';

}

int validate(char userID[], char password[])
{
    FILE *fp=fopen("students_db.txt", "r");
    if(fp == NULL){
        printf("Can not open file \"students_db.txt\" ! \n");
        exit(1);
    }

    char *token;
    int rec_num=0, filed_num=0;
    char line[120];
    int found=0;

    char cur_userID[20], cur_password[20];

    while(fgets(line, sizeof(line), fp) != NULL)
    {
        rec_num++;
        token = strtok(line, ",");
        filed_num=0;
        while(token != NULL)
        {
            filed_num++;
            switch(filed_num)
            {
            case 1:
                strcpy(cur_userID, token);
                break;
            case 2:
                strcpy(cur_password, token);
                break;
            }
            token = strtok(NULL, ",\n");
        }
        if(strcmp(cur_userID,userID)==0 && strcmp(cur_password,password) ==0)
        {
            found=1;
            break;
        }
    }
    fclose(fp);
    return (found);
}

