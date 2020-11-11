#include <iostream>
using namespace std;

int binary(int arr[], int n)
{
  int i=0;
  while(n>0)
  {
    arr[i] = n%2;
    i++;
    n /= 2;
  }
  return i;
}

bool palindrome(int arr[],int j)
{
  int i=0;
  while(i<j)
  {
    if(arr[i] != arr[j-1])
      return false;
    i++;
    j--;
  }
  return true;
}

int main() 
{
  int n;
  cin>>n;
  int arr[10];
  int len = binary(arr,n);
  if(palindrome(arr, len))
    cout<<"Yes";
  else
    cout<<"No";
  return 0;
}