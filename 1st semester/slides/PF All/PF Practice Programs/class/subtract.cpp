#include <iostream>
using namespace std;
class mathsub
{
public:
    int sub(int a, int b)
    {
        int c = a - b;
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
    mathsub subtrac;
    subtrac.sub(a, b);

    return 0;
}
