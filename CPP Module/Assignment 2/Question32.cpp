/*#include <iostream>
using namespace std;

void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main()
{
    int x = 10, y = 20;

    swap(&x, &y);

    cout << "x :" <<x<< " " <<endl;
    cout << "y :" <<y<< " " <<endl;

    return 0;
}*/

/*#include <iostream>
using namespace std;

void swap(int &a, int &b)
{
    int temp = a;
    a = b;
    b = temp;
}

int main()
{
    int x = 10, y = 20;

    swap(x, y);

    cout << x << " " << y;

    return 0;
} */

#include <iostream>
using namespace std;

class Student
{
    int rollNo;
    string name;
    int marks;

public:
    void acceptDetails()
    {
        cin >> rollNo >> name >> marks;
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
}