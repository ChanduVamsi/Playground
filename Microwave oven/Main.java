#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float t;
  cin>>n>>t;
  if(n==2)
    t += t/2;
  if(n==3)
    t += t;
  if(n<=3)
  	cout<<t;
  else
    cout<<"Number of items is more";
}