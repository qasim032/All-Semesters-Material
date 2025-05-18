#include <iostream>

using namespace std;

int main()
{
    //int size = 5;
    int numbers[5];

    for (int i=1; i<=5; i++)
    {
        cout<<"Enter number "<<i<<": ";
        cin>>numbers[i];
    }

    cout<<"The array elements are: ";
    for (int i=1; i<=5; i++)
    {
        cout<<numbers[i]<<" ";
    }
    return 0;
}
