#include <iostream>

using namespace std;

int factorial(int n)
{
    if(n <= 1)
        return 1;
    return n*factorial(n-1);
}
int main()
{
    int num;
    cout<<"Input the number to find its factorial: ";
    cin>>num;
    cout<<factorial(num);
    return 0;
}
