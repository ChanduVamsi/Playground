#include <iostream>
#include <math.h>
using namespace std;

int main() 
{
  int i,j,n,k,x;
  cin>>n;
  int arr[n];
  for(i=0;i<n;i++)
    cin>>arr[i];
  cin>>k;
  
  for(j=0;j<k;j++)
  {
    x = 0;
    for(i=0;i<n;i++)
    {
      if(arr[x]<arr[i])
        x = i;
    }
    arr[x]= sqrt(arr[x]);
  }
  x=0;
  for(i=0;i<n;i++)
    x += arr[i];
  cout<<x;
  return 0;
}