#include <iostream>
#include <cmath>
using namespace std;

void printArray(double* signal, int n)
{
    double* ptr = signal;
    while (ptr < signal + n)
    {
        cout << *ptr << " ";
        ptr++;
    }
    cout << endl;
}

double computeRMS(double* signal, int n)
{
    double sum = 0;
    double* ptr = signal;

    while (ptr < signal + n)
    {
        sum += (*ptr) * (*ptr);
        ptr++;
    }

    return sqrt(sum / n);
}

void normalise(double* signal, int n)
{
    double* ptr = signal;
    double maxVal = fabs(*ptr);

    while (ptr < signal + n)
    {
        if (fabs(*ptr) > maxVal)
            maxVal = fabs(*ptr);
        ptr++;
    }

    ptr = signal;
    while (ptr < signal + n)
    {
        *ptr = *ptr / maxVal;
        ptr++;
    }
}


int countZeroCrossings(double* signal, int n)
{
    int count = 0;
    double* ptr = signal;

    while (ptr < signal + n - 1)
    {
        if ((*ptr > 0 && *(ptr + 1) < 0) ||
            (*ptr < 0 && *(ptr + 1) > 0))
        {
            count++;
        }
        ptr++;
    }

    return count;
}

void applyGain(double* signal, int n, double gainFactor)
{
    double* ptr = signal;

    while (ptr < signal + n)
    {
        *ptr = (*ptr) * gainFactor;
        ptr++;
    }
}

int main()
{
    double signal[] = {0.5, -1.2, 0.8, -0.3, 1.0, -0.9, 0.1};
    int n = sizeof(signal) / sizeof(signal[0]);

    cout << "Original Signal : ";
    printArray(signal, n);

    cout << "RMS : " << computeRMS(signal, n) << endl;
    cout << "Zero Crossings : " << countZeroCrossings(signal, n) << endl;

    normalise(signal, n);
    cout << "\nAfter Normalise : ";
    printArray(signal, n);

    applyGain(signal, n, 2.0);
    cout << "After Gain (2.0): ";
    printArray(signal, n);

    return 0;
}