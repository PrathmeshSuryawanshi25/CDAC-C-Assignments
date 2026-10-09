/*#include <iostream>
using namespace std;

class Student
{
    int rollNo;
    string name;
    int marks;

public:
    void acceptDetails()
    {
        cout<<"Enter RNo. :"<<endl;
        cin>>rollNo;

        cout<<"Enter name :"<<endl;
        cin>>name;

        cout<<"Enter Marks :"<<endl;
        cin>>marks;

    }

    void displayDetails()
    {
        cout << "Roll No: " << rollNo << endl;
        cout << "Name: " << name << endl;
        cout << "Marks: " << marks << endl;
    }
};

int main()
{
    Student s;

    s.acceptDetails();
    s.displayDetails();

    return 0;
}*/

#include <iostream>
using namespace std;

int main()
{
    int n;

    cout << "Enter size: ";
    cin >> n;

    int *arr = new int[n];

    cout << "Enter elements: ";
    for(int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    cout << "Elements: ";
    for(int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }

    delete[] arr;

    return 0;
}


