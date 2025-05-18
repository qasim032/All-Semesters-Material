#include <iostream>

using namespace std;

int main()
{
    int day;
    cout<<"Enter number of the day: ";
    cin>>day;
    cout<<endl;

    switch(day)
    {
        case 1:
        cout<<"Monday";
        break;

        case 2:
        cout<<"Tuesday";
        break;
    }
    return 0;
}
