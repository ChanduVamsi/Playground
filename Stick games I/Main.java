#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,res;
  cin>>n>>m;
  if(n>m)
    res=m;
  else
    res=n;
  if(res%2==0)
    cout<<"Jaime Lannister";
  else
    cout<<"Tyrion Lannister";
  return 0;
}