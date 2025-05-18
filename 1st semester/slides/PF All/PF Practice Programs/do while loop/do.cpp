#include<iostream>
using namespace std;
int main()
{
    int a,i;
    i=1;
    cout<<"Enter a number";
    cin>>a;
    do
    {
        cout<<a<<"*"<<i<<"="<<a*i<<endl;
         i++;
    } while (i<=10);
    return 0;
    
}