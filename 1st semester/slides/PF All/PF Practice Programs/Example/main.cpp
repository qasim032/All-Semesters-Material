#include <iostream>

using namespace std;

int swapping(int a, int b)
{
    int temp=a;
    a=b;
    b=temp;
    cout<<a<<" "<<b<<endl;
}

int main()
{
    swapping(10,3);
    return 0;
}
