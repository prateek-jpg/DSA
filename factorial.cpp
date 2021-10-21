#include <iostream>
int main(){

    int n, fact = 1;
    cout<<"Enter number: ";
    cin>>n;
    if (n == 1 || n == 0)
    {
        cout << "Factorial of a number is: 1";
    }
    else
    {
        for (int i = 1; i <= n; i++)
        {
            fact *= i;
        }
        cout << "Factorial of a number is: " << fact;
    }
}
