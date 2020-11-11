#include <iostream>
#include <math.h>
#include <vector>
using namespace std;

int main()
{
  int i,n;
  cin>>n;
  vector<int> v;
  for(i=1;i<=sqrt(n);i++)
  {
    if(n%i==0)
    {
      if(n/i==i)
      {
        cout<<i<<" ";
      }
      else
      {
        cout<<i<<" ";
        v.push_back(n/i);
      }
    }
  }
  for(i=v.size()-1;i>=0;i--)
  {
    cout<<v[i]<<" ";
    v.pop_back();
  }
  return 0;
}