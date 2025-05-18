#include <iostream>
using namespace std;
class car
{
public:
    string brand;
    string model;
    int year;
    car(string x, string y, int z)
    {
        brand = x;
        model = y;
        year = z;
    }
};
int main()
{
    car carobj1("BMW","X5",1999);
    car carobj2("Ford","Mustang",1969);

    cout<<carobj1.brand<<" "<<carobj1.model<<" "<<carobj1.year<<"\n";
    cout<<carobj2.brand<<" "<<carobj2.model<<" "<<carobj2.year<<"\n";
    return 0;
}