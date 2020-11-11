#include <iostream>
using namespace std;

int main()
{
  int r,c,n,space, mul=1;
  cin>>n; 
  //first half
  for(r=1;r<=n;r++) 
  { 
    for(c=1;c<=n-r;c++)
    {
      cout<<" "; 
    }
    for(c=1;c<=mul;c++)
    {
      cout<<"*";
    }
    mul += 2;
    cout<<endl;
  }
  //Second half
  
  for (r=1;r<=3;r++)
  {
    for(c=1;c<2*n;c++)
    {
      if(c<4 || 2*n-c<=3)
        cout<<"*";
      else
        cout<<" ";
    }
    cout<<endl;
  }
  return 0;
}