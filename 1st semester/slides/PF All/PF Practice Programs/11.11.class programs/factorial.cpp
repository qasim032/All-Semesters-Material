#include<iostream>
using namespace std;
int fact( int); 
int main( )
{
int num,result;
cout<<"Enter the required number:";
cin>>num;
result = fact( num);
cout<<"Factorial is :" << result;
return 0;
}
int fact(int n)
{
int ft;
for( ft=1; n>=1; n--)
ft=ft*n;
return ft;
}