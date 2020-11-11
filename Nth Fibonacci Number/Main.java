#include <iostream>
using namespace std;

int main() 
{
  int i,n,a=0,b=1;
  cin>>n;
  if(n==1)
    cout<<a;
  else if(n==2)
    cout<<b;
  else
  {
    n -= 2;
    while(n>0)
    {
      i = b;
      b += a;
      a = i;
      n--;
    }
    cout<<b;
  }
  return 0;
}