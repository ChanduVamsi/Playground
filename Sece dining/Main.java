#include<iostream>
using namespace std;
int main()
{
  string a;
  int b;
  cin>>a>>b;
  if(a=="front" || a=="FRONT")
  {
    if(b==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else
  {
    if(b==2)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
}