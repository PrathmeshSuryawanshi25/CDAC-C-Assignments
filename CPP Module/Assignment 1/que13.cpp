#include<iostream>
using namespace std;

void Room(double temp[3][3])
{
    for(int i = 0; i < 3; i++ )
    {
        for(int j = 0; j < 3; j++ )
        {
            cin>>temp[i][j];
        }
        
    }


}
void display(double temp[3][3])
{
    cout << "\tRoom1\tRoom2\tRoom3\n";
    for(int i = 0; i < 3; i++ )
     
    {
         cout << "Floor " << i+1 << "\t";

        for(int j = 0; j < 3; j++ )
        {
            cout<<temp[i][j]<<"\t";
        }
        cout<<endl;
        
    }


}
void HottestRoom(double temp[3][3])
{
    double max =0;
    int floor = 0;
    int room = 0;

    for(int i = 0; i < 3; i++ )
     
    {

        for(int j = 0; j < 3; j++ )
        {
            if(temp[i][j] > max)
            {
                temp[i][j] = max;
                floor = i;
                room = j;
            }
        }
        
        
    }
    cout<<"Hottest Room  : Floor "<<floor+1<<",Room" <<room+1  << "max "<<"c"<<endl;


}
void Average(double temp[3][3])
{
    double highAvg = 0;
    double sum = 0;
    double floor = 0;

    for(int i = 0; i < 3; i++ )
    {
        for(int j = 0; j < 3; j++ )
        {
            
            sum+=temp[i][j];
            
        }
        double Avg = sum / 3;

        if(Avg > highAvg )
        {
            highAvg=Avg;

            floor = i;

        }


        
    }
     cout<<"Hottest floor  : Floor "<<floor+1<<"Room" <<  " (Avg = " << highAvg << " C)" << endl;
}

void TotalRoom(double temp[3][3])
{   double count = 0;

    for(int i = 0; i < 3; i++ )
    {
        for(int j = 0; j < 3; j++ )
        {
            if(temp[i][j] >= 30)
                count++;
        }
        
    }
    cout<<"Rooms at WARNING or above: "<<count<<endl;


}
int main()
{
    double temp[3][3];
    

    cout << "Enter 9 temperature readings:\n";

    

    Room(temp);
    display( temp);
    HottestRoom( temp);
    Average( temp);
    TotalRoom( temp);

    return 0;






}
           

