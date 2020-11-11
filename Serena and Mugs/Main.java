#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,v,i,sum=0;
  cin>>n>>v;
  int vol[n];
  for(i=0;i<n;i++)
  {
    cin>>vol[i];
    sum += vol[i];
  }
  if(sum<=v)
    cout<<"YES";
  else
    cout<<"NO";
  return 0;
}