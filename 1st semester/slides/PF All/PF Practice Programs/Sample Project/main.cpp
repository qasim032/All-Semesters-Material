#include <iostream>
#include <conio.h>

using namespace std;

int main() // default return type of main in c++ is int
{
    int num1, num2;
    cout << "Enter first integer: ";
    cin >> num1;
    cout << "Enter second integer: ";
    cin>> num2;
    cout<<endl;
    cout << "Addition: " << num1 + num2 << endl;
    cout << "Subtraction: " << num1 - num2 << endl;
    cout << "Multiplication: " << num1 * num2 << endl;
    cout << "Division: " << (doublenum1) / double(num2) << endl;


    /*int name;
    cout<<"Enter your name: ";
    cin>>name;
    cout<<"You entered: "<<name;
    cout<<endl;

  // error: assignment of read-only variable 'myNum'
    /*string name = "24BSAI";
    cout<<"Your Batch: "<<name;
    cout<<endl;

    Body
    cout<<"My roll number is \'24 BSAI 02\'" <<endl; //
    cout<<endl;
    cout << "This will return integer value." <<endl<< "This text is after one line space" <<endl;
    //cout << setw(10);
    //std::cout <<123<< std::endl;*/

    return 0;
}
