#include <iostream>
using namespace std;

int main()
{
  int i,x,n;
  cin>>n;
  if(n%2!=0)
  {
    x=1;
    i=1;
    while(i<=n/2)
    {
      i++;
      x *= 2;
    }
    cout<<x;
  }
  else
  {
    x=1;
    i=1;
    while(i<n/2)
    {
      i++;
      x *= 3;
    }
    cout<<x;
  }
  return 0;
}