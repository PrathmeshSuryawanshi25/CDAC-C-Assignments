#include<iostream>
using namespace std;

int getstatus(double temp)
{
    if(temp < 0)
       return -1;

    else if(temp >= 0 && temp <= 29) 
        return 0;

    else if(temp >= 30 && temp <= 44) 
        return 1;
        
    else if(temp >= 45 && temp <= 59) 
        return 2;
        
    else 
        return 3;    

}

void Action(int status)
{

    switch (status)
    {
    
    case -1:
    cout<< "status :SENSOR_ERROR" <<endl;
    cout<<"Action : Sensor fault  check wiring"<<endl;
    break;
        
    case 0:
    cout<< "status :NORMAL" <<endl;
    cout<<"Action : No action required"<<endl;
    break;

    case 1:
    cout<< "status :WARNING" <<endl;
    cout<<"Action : Alert sent to supervisor"<<endl;
    break;

    case 2:
    cout<< "status :CRITICAL" <<endl;
    cout<<"Action : Cooling system triggered"<<endl;
    break;

    case 3:
    cout<< "status :SHUTDOWN" <<endl;
    cout<<"Action : Emergency shutdown initiated"<<endl;
    break;
    }

}    

    
    

int main()
{
    double temp, Fahrenheit;
    int status;
    cout << "Enter temperature: ";
    cin >> temp;

    Fahrenheit = (temp * 9 / 5) + 32;
    status = getstatus(temp);

    cout << "Temperature : " << temp << "C / "<< Fahrenheit << "F" << endl;

    Action(status);

    cout << "Reading  : " << (temp > 25 ? "above average" : "below average");

    return 0;


}    
