#include <iostream>
using namespace std;

int main() {
    int list[10] = {12, 23, 32, 10, 0, 91, 0, 15, 1, 9};

    for (int i = 0; i < 10; i++) {
        if (list[i] < 5) {
            cout << i << endl;
        }
        
    }
    return 0;
}