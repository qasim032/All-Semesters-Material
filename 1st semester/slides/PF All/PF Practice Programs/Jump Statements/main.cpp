#include <iostream>

using namespace std;

int main()
{
    /*
    for (int i=1; i<=100; i++)
    {
        if (i == 20)
            break;
        cout<<"Number: "<<i<<endl;
    }
    */


    for (int i=1; i<=10; i++)
    {
        if (i%2 != 0)
            continue;
        cout<<"Number: "<<i<<endl;
    }


    /*
    int num;
    cout<<"Enter a number: ";
    cin>>num;
    if (num%2 == 0)
    {
        goto print;
    }
    else
    {
        cout<<"Odd Number";
        return 0;
    }
    print:  cout <<"Even Number";
    */
    return 0;
}
