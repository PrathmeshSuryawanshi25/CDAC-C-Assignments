#include <iostream>
using namespace std;

class Product
{
private:
    int productId;
    string name;
    double price;
    int quantity;


public:
    void acceptDetails()
    {
        cout << "Enter ID: "<<endl;
        cin >> productId;

        cout << "Enter Name: "<<endl;
        cin >> name;

        cout << "Enter Price: "<<endl;
        cin >> price;

        cout << "Enter Quantity: "<<endl;
        cin >> quantity;
    }

    void displayDetails() const
    {
        cout << productId << "\t"
             << name << "\t"
             << price << "\t"
             << quantity << "\t"
             << totalValue();

        if (quantity < 10)
            cout << "\tLOW STOCK";

        cout << endl;


    }

    double totalValue() const
    {
        return price * quantity;
    }

    bool isLowStock(int threshold) const
    {
        return quantity < threshold;
    }

    string getName() const
    {
        return name;
    }
    
};

int main()
{
    Product p[5];

    for(int i=0; i<5; i++)
    {
        cout << "\nProduct " << i+1 << endl;
        p[i].acceptDetails();
    }

    cout << "\n===== INVENTORY REPORT =====\n";
    cout << "ID\tName\tPrice\tQty\tTotal" << endl;

    int max = 0;

    for(int i=0; i<5; i++)
    {
        p[i].displayDetails();

        if(p[i].totalValue() > p[max].totalValue())
            max = i;
    }

    cout << "\nHighest Value Product: "
         << p[max].getName()
         << " (Rs. " << p[max].totalValue() << ")" << endl;

    int threshold;
    cout << "\nEnter Threshold: ";
    cin >> threshold;

    cout << "Low Stock Products: ";

    bool found = false;
    for(int i=0; i<5; i++)
    {
        if(p[i].isLowStock(threshold))
        {
            cout << p[i].getName() << " ";
            found = true;
        }
    }

    if(!found)
        cout << "None";

    return 0;
}