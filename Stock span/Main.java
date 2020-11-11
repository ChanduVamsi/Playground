#include<iostream>
using namespace std;
int main()
{
    int n,i,x=0,y=1;
    cin>>n;
    int arr[n];
  
    for(i=0;i<n;i++)
        cin>>arr[i];
    cout<<y<<endl;
  
    for(i=0;i<n-1;i++)
    {
        if(arr[i]>arr[i+1])
          cout<<y<<endl;
        else
        {
          x += 2;
      	  cout<<x<<endl;
        }
    }
}