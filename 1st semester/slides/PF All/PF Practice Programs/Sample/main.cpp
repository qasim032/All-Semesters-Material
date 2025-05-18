#include <iostream>

using namespace std;

int main()
{
    /*
    int i, j, factorial=1;
    cout<<"Enter any number: ";
    cin>>j;
    for (int i=1; i<=j; i++)
    {
        factorial = factorial*i;

    }
    cout<<factorial;
    */

    /*

    int num;
    bool isPrime = true;  // Assume the number is prime

    cout << "Enter a number: ";
    cin >> num;

    if (num <= 1)
    {
        cout<<"1 is not a prime number";  // Numbers less than or equal to 1 are not prime
    }
    else
    {
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {  // If num is divisible by any number other than 1 and itself
                cout<<num<<" is not a prime number.";
                break;  // No need to continue if a divisor is found
            }
            else
            {
                cout<<num<<" is a prime number";
                break;
            }
        }
    }*/
    /*

    int dist, time, speed = (dist*1000)/(time*3600);
    cout<<"Enter two numbers: "<<endl;
    cin>>dist>>time;
    if (time>0)
    {
        cout<<speed;
    }
    else
    {
        cout<<"Error";
    }
    */

    int a = 21;
     int c;
     c = a++;
     cout << a+c;

    return 0;
}
