#include <iostream>
#include <cmath>
using namespace std;

inline double distanceBetween(double x1, double y1, double x2, double y2)
{
    return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
}

inline double toRadians(double degrees)
{
    return degrees * (M_PI / 180.0);
}


inline double clamp(double value, double minVal, double maxVal)
{
    if(value < minVal)
        return minVal;
    if(value > maxVal)
        return maxVal;
    return value;
}

inline bool isInSafeZone(double x, double y, double cx, double cy, double radius)
{
    return distanceBetween(x, y, cx, cy) <= radius;
}

int main()
{
    double homeX = 0.0, homeY = 0.0;
    double radius = 50.0;

    
    double wx[] = {20.0, 30.0, 60.0};
    double wy[] = {15.0, 40.0, 10.0};

    for(int i = 0; i < 3; i++)
    {
        double dist = distanceBetween(homeX, homeY, wx[i], wy[i]);

        cout << "Waypoint " << i + 1 << " : ("
             << wx[i] << ", " << wy[i] << ")\n";

        cout << "Distance : " << dist << endl;

        if(isInSafeZone(wx[i], wy[i], homeX, homeY, radius))
            cout << "Status : Inside Safe Zone\n";
        else
            cout << "Status : Outside Safe Zone\n";

       
    }

    return 0;
}