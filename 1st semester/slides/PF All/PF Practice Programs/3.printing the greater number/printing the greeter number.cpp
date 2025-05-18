#include <iostream>
using namespace std;
int main()
{
    int num1, num2, num3, largest;
    cout << "Enter a number ";
    cin >> num1;

    cout << "Enter a number ";
    cin >> num2;

    cout << "Enter a number ";
    cin >> num3;
    largest = num1;
    if (num2 > num1 and num2 > num3)
    {
        largest = num2;
        cout << "The largest number is \n" << largest;
    }
    else if (num3>num1 and num3 >num2)
    {
        largest = num3;
        cout<<"The largest number is \n"<<largest;
    }
    else {
        cout<<"The largest number is \n"<<largest;
    }
    
}