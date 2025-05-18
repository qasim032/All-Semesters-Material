#include<iostream>
using namespace std;
int main()
{
    float pi=3.142;
    float r;
    cout<<"Enter the value of radius: ";
    cin>>r;
    cout<<"The area of circle is: "<<pi*r*r<<endl;
    cout<<"The diameter of radius is: "<<r/2<<endl;
    cout<<"The circumference of circle is: "<<2*pi*r<<endl;
    return 0;
}