#include <iostream>
using namespace std;

int main() 
{
  int i,n;
  cin>>n;
  int arr[n];
  int s=0,x,e=n-1;
  for(i=0;i<n;i++)
  {
    cin>>x;
    if(x==1)
    {
      arr[e] = 1;
      e--;
    }
    else
    {
      arr[s] = 0;
      s++;
    }
  }
  for(i=0;i<n;i++)
  {
    cout<<arr[i];
  }
  return 0;
}