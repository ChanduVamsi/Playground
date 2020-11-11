#include <iostream>
using namespace std;

int main() 
{
  int i,x,n;
  cin>>n;
  if(n%2!=0)
  {
    i=1;
    x=0;
    while(i<=n/2)
    {
      x += 2;
      i++;
    }
    cout<<x;
  }
  else
  {
    i=1;
    x=0;
    while(i<n/2)
    {
      x += 1;
      i++;
    }
    cout<<x;
  }
  return 0;
}