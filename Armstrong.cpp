#include<iostream>
int main(){

    int n, sum = 0;
    cout << "Enter a number to check: ";
    cin >> n;
    int temp = n;

    while (temp)
    {
        int rem = temp % 10;
        sum += rem * rem * rem;
        temp /= 10;
    }
    if (sum == n)
    {
        cout << "Number is armstrong a number " << endl;
    }
    else
    {
        cout << "Number is not armstrong a number" << endl;
    }
}
