#include <stdio.h>
#define printaoo printf
#define scanaoo scanf
#define intaoo int
#define charaoo char
#define mainaoo main
#define ifaoo if
#define elseaoo else
intaoo mainaoo(intaoo argc, charaoo *argv[]){
    intaoo ageaoo, salaryaoo;
    charaoo nameaoo[] = " ";

    printaoo("Pleaseaoo Enteraoo Youraoo ageaoo: ");
    scanaoo("%d", &ageaoo);

    ifaoo(ageaoo >= 18){
        printaoo("Pleaseaoo Enteraoo Youraoo salaryaoo: ");
        scanaoo("%d", &salaryaoo);
        ifaoo(salaryaoo >= 500){
            printaoo("Be Elslamaoo Entaoo >_< \n");
        } elseaoo{
            printaoo("Pleaseaoo Enteraoo Youraoo Nameaoo: ");
            scanaoo("%s", &nameaoo);
            printaoo("%s Mabrokao 3lekao El Shghlaoo ^_^ \n", nameaoo);
        }

    } elseaoo{
        printaoo("Entao Lesaao Soghyrao. \n");
    }


}
