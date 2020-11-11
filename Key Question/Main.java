#include <iostream>
using namespace std;

int main() 
{
  int n,i,len=0;
  cin>>n;
  int arr[10];
  while(n>0)
  {
    arr[len] = n%10;
    len++;
    n /= 10;
  }
  for(i=0;i<len;i++)
  {
    int min = i;
    for(int j=i+1;j<len;j++)
    {
      if(arr[min]>arr[j])
        min = j;
    }
    if(min!=i)
    {
      n = arr[min];
      arr[min] = arr[i];
      arr[i] = n;
    }
    cout<<arr[i]<<" ";
  }
  return 0;
}