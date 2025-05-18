#include <iostream>

using namespace std;

int main()
{
    double myDouble;
    cout<<"Enter any number in decimal points: "<<endl;
    cin>>myDouble;

    int myInt = (int) myDouble;
    cout<<endl<<"The integer equivalent is: ";
    cout<<myInt;
    return 0;
}
