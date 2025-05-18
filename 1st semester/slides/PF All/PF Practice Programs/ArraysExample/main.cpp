#include <iostream>

using namespace std;

int main()
{
    int ages[8] = {20, 22, 18, 35, 48, 26, 87, 70};
    float avg, sum = 0;

    int length = 8;

    for (int age : ages)
    {
        sum += age;
    }

    avg = sum / length;

    cout << "The average age is: " << avg << "\n";
    return 0;
}
