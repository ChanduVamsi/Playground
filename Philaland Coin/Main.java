#include<iostream>
using namespace std;

int main()
{
  int t,n,count;
  cin>>t;
  while(t>0)
  {
    t--;
    cin>>n;
    count=0;
    while(n>0)
    {
      n = n>>1; //or n /= 2;
      count++;
    }
    cout<<count<<endl;
  }
  return 0;
}