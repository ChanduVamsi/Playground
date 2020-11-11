#include <iostream>
#include <array>
using namespace std;

int main() 
{
  int t,n,i,j,x;
  cin>>t;
  while(t>=1)
  {
    cin>>n;
    int arr[n];
    for(i=0;i<n;i++)
    {
      cin>>arr[i];
    }
    for(i=0;i<n;i++)
    {
      x=0;
      for(j=i+1;j<n;j++)
      {
        if(arr[i]<arr[j])
        {
          x++;
          break;
        }
      }
      if(x==0)
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    t--;
  }
  return 0;
}