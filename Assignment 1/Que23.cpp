#include <iostream>
using namespace std;

int main()
{
    int statusReg  = 0b10110001;   // Read-only
    int controlReg = 0b00000000;   // Writable
    int dataReg    = 0b11001010;   // For repoint demo

    // -------------------------------
    // regPtr1 : Pointer to const int
    // -------------------------------
    const int *regPtr1 = &statusReg;

    cout << "Status Register : " << *regPtr1 << endl;

    // *regPtr1 = 10;
    // ERROR: Cannot modify value through pointer to const

    regPtr1 = &dataReg;     // Allowed (pointer can change)
    cout << "Repointed Value : " << *regPtr1 << endl;


    // --------------------------------
    // regPtr2 : Const pointer to int
    // --------------------------------
    int *const regPtr2 = &controlReg;

    *regPtr2 = 170;   // Allowed
    cout << "Control Register : " << *regPtr2 << endl;

    // regPtr2 = &dataReg;
    // ERROR: Const pointer cannot point to another address


    // ---------------------------------------
    // regPtr3 : Const pointer to const int
    // ---------------------------------------
    const int *const regPtr3 = &statusReg;

    cout << "ROM / Status Value : " << *regPtr3 << endl;

    // *regPtr3 = 5;
    // ERROR: Cannot modify the value

    // regPtr3 = &dataReg;
    // ERROR: Cannot change the address

    return 0;
}