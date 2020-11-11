#include<iostream>
using namespace std;
int main()
{
  //Type your code here.'
  int i=0,n;
  float x,sum=0.5;
  cin>>n;
  while(i<n)
  {
    cout<<sum<<" ";
    x = 2*sum;
    sum += x;
    i++;
  }
}