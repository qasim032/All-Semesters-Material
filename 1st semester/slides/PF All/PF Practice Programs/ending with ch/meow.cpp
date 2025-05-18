#include<iostream>
using namespace std;
int main()
{
    int num1,num2;
    char ch;
    while (ch!='n')
    {
        cout<<"Enter first number: ";
        cin>>num1;
        
        cout<<"Enter second number: ";
        cin>>num2;

        cout<<num1+num2<<endl;
        cout<<"Enter any alphabet to continue:  ";
        cin>>ch;
        cout<<endl;


    }
    return 0;
}