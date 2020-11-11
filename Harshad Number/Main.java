#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,n,sum=0;
  cin>>n;
  i=n;
  while(i>0)
  {
    sum += i%10;
    i /= 10;
  }
  if(n%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  return 0;
}