#include<iostream>
using namespace std;

double reorderCost(int qty, double unitPrice){
    return qty * unitPrice;
}

double reorderCost(double qty, double unitPrice){
    return qty * unitPrice;
}

double reorderCost(int qty, double unitPrice, double taxRate){
    double cost = qty * unitPrice;
    return cost + (cost * taxRate / 100);
}

double applyDiscount(double price, double discountPercent = 10.0){
    return price - (price * discountPercent / 100);
}

int main(){

    int qty1;
    double qty2;
    double unitPrice1;
    double taxRate1;
    double discountPercent1;

    cout << "Enter integer quantity: ";
    cin >> qty1;

    cout << "Enter fractional quantity: ";
    cin >> qty2;

    cout << "Enter unit price: ";
    cin >> unitPrice1;

    cout << "Enter tax rate: ";
    cin >> taxRate1;

    cout << "Enter discount (%): ";
    cin >> discountPercent1;

    cout << "\nReorder Cost (int): "
         << reorderCost(qty1, unitPrice1) << endl;

    cout << "Reorder Cost (double): "
         << reorderCost(qty2, unitPrice1) << endl;

    cout << "Reorder Cost with Tax: "
         << reorderCost(qty1, unitPrice1, taxRate1) << endl;

   
    if(discountPercent1 < 10){
        cout << "Discounted Price: "
             << applyDiscount(unitPrice1) << endl;
    }
    else{
        cout << "Discounted Price: "
             << applyDiscount(unitPrice1, discountPercent1) << endl;
    }

    return 0;
}