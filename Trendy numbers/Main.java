#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,n;
  cin>>n;
  i = n%100;
  i /= 10;
  if(i%3==0 && n<1000 && n>99)
    cout<<"Trendy Number";
   else if(n<100 || n>999)
     cout<<"Invalid Number";
   else
     cout<<"Not a Trendy Number";
}