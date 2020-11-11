#include <iostream>
using namespace std;

int main() 
{
  int i,n,a,b,temp;
  cin>>n;
  if(n>30)
  {
    cout<<"Invalid Input";
  }
  else
  {
    a=1;
    b=2;
    if(n==1)
    {
      cout<<a;
    }
    else if(n==2)
    {
      cout<<b;
    }
    else
    {
      i=2;
      while(i<n)
      {
        i++;
        temp = b;
        b += a;
        a = temp;
      }
      cout<<b;
    }
  }
  return 0;
}