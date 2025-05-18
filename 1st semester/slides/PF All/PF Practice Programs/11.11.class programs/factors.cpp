#include <iostream>
using namespace std;


void findFactors(int number) {
    cout << "Factors of " << number << " are: ";
    for (int i = 1; i <= number; i++) {
        if (number % i == 0)  
            cout << i << " ";
    }
    cout << endl;
}

int main() {
    int num;

    cout << "Enter a number: ";
    cin >> num;
    findFactors(num);

    return 0;
}
