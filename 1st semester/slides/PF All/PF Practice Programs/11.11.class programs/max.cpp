#include <iostream>
using namespace std;


int findMaximum(int a, int b, int c) {
    int max = a;

    if (b > max)
        max = b;
    if (c > max)
        max = c;

    return max;
}

int main() {
    int num1, num2, num3;

    cout << "Enter number1: ";
        cin >> num1 ;
    cout << "Enter number2: ";
        cin >> num2; 
    cout << "Enter number3: ";
        cin >> num3;


    int maxNumber = findMaximum(num1, num2, num3);
    cout << "The maximum number is: " << maxNumber << endl;

    return 0;
}
