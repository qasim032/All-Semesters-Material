#include <iostream>
using namespace std;
class math
{
public:
    int add(int a, int b)
    {
        int c = a + b;
        cout << c << endl;
    }
};
int main()
{
    int a, b;
    cout << "Enter first  number";
    cin >> a;
    cout << "Enter second number";
    cin >> b;
    math AddIt;
    AddIt.add(a, b);

    return 0;
}
