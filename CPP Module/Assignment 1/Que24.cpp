#include <iostream>
using namespace std;

bool parsePacket(const int* rawData, int size,
                 int** outMin, int** outMax)
{
    if(size <= 0)
        return false;

    const int* min = rawData;
    const int* max = rawData;
    const int* ptr = rawData;

    while(ptr < rawData + size)
    {
        if(*ptr < *min)
            min = ptr;

        if(*ptr > *max)
            max = ptr;

        ptr++;
    }

    *outMin = (int*)min;
    *outMax = (int*)max;

    return true;
}

int main()
{
    int packet[] = {45, 12, 67, 8, 55, 31};

    int* minPtr = nullptr;
    int* maxPtr = nullptr;

    if(parsePacket(packet, 6, &minPtr, &maxPtr))
    {
        cout << "Calibration Min : " << *minPtr << endl;
        cout << "Calibration Max : " << *maxPtr << endl;
    }

    return 0;
}