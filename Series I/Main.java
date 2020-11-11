#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,n,sum=1,x=1;
  cin>>n;
  cout<<1<<" ";
  for(i=1;i<n;i++)
  {
    x += 2;
    sum += x;
    cout<<sum<<" ";
  }
}