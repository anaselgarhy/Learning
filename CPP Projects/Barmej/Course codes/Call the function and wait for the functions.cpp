#include<iostream>
using namespace std;

int equationX(int n){
    return n * n ;
}
int equationY(int n){
    return n * n * n;
}
int equationZ(int n){
    return n * n * n * n ;
}
int equation1(int n){
    return equationX(n) + equationY(n) + equationZ(n);
}
int main()
{
    cout << equation1(2) << endl;
    return 0;
}
