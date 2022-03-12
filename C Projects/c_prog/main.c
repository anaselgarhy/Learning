# include <stdio.h>
# include <stdlib.h>

int arr[] = {0, 1, 2, 3, 4};

void traverseArray(void (*pf) (int)) {
  for (int i = 0; i < 4; i++) {
    (*pf)(arr[i]);
  }
}

void display(int num) {
  printf("> %d\n", num);
}

int main(void) {
  traverseArray(&display);
  printf("Done\n");
}
