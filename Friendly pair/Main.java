#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,sa=0,sb=0,i;
  cin>>a>>b;
  
  for(i=1;i<=a;i++)
    if(a%i==0)
      sa += i;
  sa /= a;
  
  for(i=1;i<=b;i++)
    if(b%i==0)
      sb += i;
  sb /= b;
  
  if(sa==sb)
    cout<<"Friendly Pair";
  else
    cout<<"Not Friendly Pair";
}