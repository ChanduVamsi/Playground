#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  if (n>100)
    cout<<"Invalid Input";
  else if (n==100)
    cout<<"S";
  else if (n>=90)
    cout<<"A";
  else if (n>=80)
    cout<<"B";
  else if (n>=70)
    cout<<"C";
  else if (n>=60)
    cout<<"D";
  else if (n>=50)
    cout<<"E";
  else
    cout<<"F";
  return 0;
}