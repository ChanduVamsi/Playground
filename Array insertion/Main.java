#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,n,k,x;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  int a[2*n];
  for(i=0;i<2*n;i++)
    a[i]=0;
  for(i=0;i<n;i++)
     cin>>a[i];
  cout<<"Enter the location where you wish to insert an element"<<endl;
  cin>>k;
  if(k>n)
    cout<<"Invalid Input";
  else
  {
  cout<<"Enter the value to insert"<<endl;
  cin>>x;
  cout<<"Array after insertion is"<<endl;
  for(i=n;i>k-1;i--)
      a[i] = a[i-1];
  a[k-1]=x;
  for(i=0;i<=n;i++)
     cout<<a[i]<<endl;
  }
  return 0;
}