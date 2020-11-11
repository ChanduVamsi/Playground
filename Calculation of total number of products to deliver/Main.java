#include <iostream>
using namespace std;

int sumofd(int n)
{
  int sum=0;
  while(n>0)
  {
    sum += n%10;
    n /= 10;
  }
  return sum;
}

int main() 
{
  int i,j,n;
  cin>>n;
  int arr[n];
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
    cout<<sumofd(arr[i])<<" ";
  }
  return 0;
}