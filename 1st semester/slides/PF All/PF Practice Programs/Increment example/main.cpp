#include <iostream>

using namespace std;

int main()
{
    int a=4, b;
    b = a++ + ++a + ++a;
    cout<<"a: "<<a<<endl;
    cout<<"b: "<<b<<endl;
    return 0;
}
