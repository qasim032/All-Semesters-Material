#include <iostream>

using namespace std;

/*
void swap(int &a, int &b)
{
    int temp = a;
    a = b;
    b = temp;
}
*/

int add(int *a, int *b)
{
    return *a+*b;
}
int main()
{
    /*
    int x = 10, y = 20;
    cout << "Before swapping: x = " << x << ", y = " << y << endl;

    swap(x, y);

    cout << "After swapping: x = " << x << ", y = " << y << endl;
    */

    int c=10, d=20;
    cout<<add(&c,&d);
    return 0;
}
