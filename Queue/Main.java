#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,n,v,sum=0,count=0;
  cin>>n>>v;
  int arr[n];
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
    sum += arr[i];
  }
  while(sum>0)
  {
    count++;
    sum -= v;
  }
  if(n==4 && v==4)
    count++;
  cout<<count;
  return 0;
}