#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void userInterface1()
{
    printf(" Choose the operation you want to perform :\n");
    printf(" 1-Read account information\n");
    printf(" 2-Register a new account\n");

}
int main(int argc, char *argv[]) {

    userInterface1();
   int c;
   scanf("  %d",&c);
   if(c ==1)
   {
       /*
       Read the user
       */
       printf("Enter your username : ");
       char acc_name[20];
       scanf("%s", acc_name);
       /*
       Open file if availble
       */
       FILE *f = fopen(acc_name, "r");
       if(f == NULL)
       {
           printf("This account does not exist. Please register a new account\n");
           exit(1);
       }
       /*
       Read file
       */
       fseek(f, 0,SEEK_END);
       int acc_data_sz =ftell(f);
       fseek(f, 0, SEEK_SET);
       char *acc_data = ((char *)malloc(acc_data_sz));
       fread(acc_data, sizeof(char), acc_data_sz, f);
       //print
       printf("Account required : \n");
       printf("%s", acc_data);
       // Clean up
       free(acc_data);
       fclose(f);
   }
   //2
   else if(c ==2)
   {
    printf("Please enter the account name : ");
    char acc_name[20];
    scanf("%s", acc_name);
    //Password
    printf("Please enter the account password : ");
    char acc_password[20];
    scanf("%s", acc_password);

    /*
    Write on file
    */
    FILE *f = fopen(acc_name, "w");
    char *space =" | ";
    fwrite(acc_name , sizeof(char) , strlen(acc_name), f);
    fwrite(space, sizeof(char), strlen(space), f);
    fwrite(acc_password, sizeof(char), strlen(acc_password), f);
    // Close file
    fclose(f);
    // Done
    printf("Done ^_~");
   }
   else
   {
       printf("Error");
   }

    return 0;
}
