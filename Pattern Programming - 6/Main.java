#include <iostream>
using namespace std;

int main() 
{
  int r,c,n;
  cin>>n;
  for(r=0;r<n;r++)
  {
    for(c=0;c<n-r-1;c++)
    {
      cout<<" ";
    }
    for(c=n-r;c>0;c--)
    {
      cout<<"*";
    }
    cout<<endl;
  }
  //Second half
  for(r=1;r<n;r++)
  {
    for(c=0;c<r;c++)
    {
      cout<<" ";
    }
    for(c=0;c<=r;c++)
    {
      cout<<"*";
    }
    cout<<endl;
  }
  return 0;
}