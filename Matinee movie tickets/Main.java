#include<iostream>
using namespace std;
int main()
{
  int a;
  float t,x=13.30;
  cin>>a>>t;
  if(a<13)
  {
    if(t==x)
      cout<<"$2.00";
    else
      cout<<"$4.00";
  }
  else
  {
    if(t==x)
      cout<<"$5.00";
    else
      cout<<"$8.00";
  }
}