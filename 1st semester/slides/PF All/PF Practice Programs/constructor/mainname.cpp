#include <iostream>
using namespace std;
class myINFO
{
public:
    string name;
    string rollNO;
    int age;
    myINFO(string a, string b, int c)
    {
        name = a;
        rollNO = b;
        age = c;
    }
};
int main()
{
    myINFO myINFOobject1("Qasim", "24BSAI29", 18);

    cout << myINFOobject1.name <<endl<< myINFOobject1.rollNO <<endl<< myINFOobject1.age << "\n";

    return 0;
}