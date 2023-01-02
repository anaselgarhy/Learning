void identity(int **a, int n) {
  int i, j;
  for (i = 0; i < n; i++) {
    for (j = 0; i < n; j++) {
      a[i][j] = 0;
    }
  }

  for (i = 0; i < n; i++) {
    a[i][i] = 1;
  }
}
