#include<iostream>
using namespace std;

void input(double temp[], int n)
{
    for(int i = 0; i < n; i++)
    {
        cin >> temp[i];
    }
}


void skip(double temp[], int n)
{
    int error = 0;
    cout << "Valid Readings : ";

    for(int i = 0; i < n; i++)
    {
        if(temp[i] < 0)
        {
            error++;
            continue;
        }

        cout << temp[i] << " ";
    }

    cout << endl;
    cout << "Skipped Errors : " << error << endl;
}


void scan(double temp[], int n)
{
    for(int i = 0; i < n; i++)
    {
        if(temp[i] >= 45)
        {
            cout << "First CRITICAL : Index " << i << endl;
            cout << "Temperature : " << temp[i] << " C" << endl;
            break;
        }
    }
}


void arithmetic(double temp[], int n)
{
    double min = 1000, max = 0, sum = 0;
    int valid = 0;
    int normal = 0, warning = 0, critical = 0, shutdown = 0;

    for(int i = 0; i < n; i++)
    {
        if(temp[i] < 0)
            continue;

        if(temp[i] < min)
            min = temp[i];

        if(temp[i] > max)
            max = temp[i];
            

        sum += temp[i];
        valid++;

        if(temp[i] <= 29)
            normal++;
        else if(temp[i] <= 44)
            warning++;
        else if(temp[i] <= 59)
            critical++;
        else
            shutdown++;
    }

    cout << "Min : " << min << " C" << endl;
    cout << "Max : " << max << " C" << endl;
    cout << "Average : " << sum / valid << " C" << endl;

    cout << "Normal : " << normal << endl;
    cout << "Warning : " << warning << endl;
    cout << "Critical : " << critical << endl;
    cout << "Shutdown : " << shutdown << endl;
}

int main()
{
    int n;
    double temp[100];

    cout<<"Enter number of readings : ";
    cin>>n;

    cout<<"Enter readings : ";
    input(temp,n);

    skip(temp,n);
    scan(temp,n);
    arithmetic(temp,n);

    return 0;
}    