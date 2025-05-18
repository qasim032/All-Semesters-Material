#include <iostream>

using namespace std;

int main()
{/*
    int table, n=1;
    cout<<"Enter a number: ";
    cin>>table;
    while (n<=10)
    {
        int result = table * n;
        cout<<table<<" * "<<n<<" = "<<result<<endl;
        n++;
    }


    /*
    int count = 0;

    while(count < 50)
    {
        cout<<count<<endl;
        count++;
    }
    cout<<"End of loop";
    */

    /*
    int num1, num2;
    char ch;

    while(ch != 'n')
   {
       cout<<"Enter first number: ";
       cin>>num1;
       cout<<"Enter second number: ";
       cin>>num2;
       cout<<"Sum = "<<num1+num2<<endl;
       cout<<"Do you want to continue (y/n)";
       cin>>ch;
       cout<<endl;
   }
   cout<<"End of loop";
   */

   /*
   int count=0;
   do
   {
       cout<<count<<endl;
       count++;
   }
   while (count <= 10);
   cout<<"End of loop";
   */

   int j, num, sum = 0;
   cout<<"Enter a number: ";
   cin>>num;
   cout<<"The sum from 1 to "<<num<<" is: ";
   for (j = 1; j <= num; j++)
    {
        sum = sum + j;
    }
    cout<<sum<<endl;

    /*
    int table, n=1;
    cout<<"Enter a number: ";
    cin>>table;
    do
    {
        int result = table * n;
        cout<<table<<" * "<<n<<" = "<<result<<endl;
        n++;
    }
    while (n<=10);
        */
    return 0;
}
