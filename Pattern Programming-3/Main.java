#include <iostream>
using namespace std;

int main()
{
  int r,c,n,a=1;
  cin>>n; 
  for(r=1;r<=n;r++) 
  { 
    for(c=1;c<=r;c++)
    {
        cout<<a<<" ";
      	a++;
    }
    cout<<endl;
  }
  return 0;
}