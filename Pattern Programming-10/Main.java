#include <iostream>
using namespace std;

int main() 
{
  int i,n,a,j;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    //Spaces
    for(j=1;j<=n-i;j++)
      cout<<" ";
    //Alphabets
    a = 'A';
    for(j=1;j<=i;j++)
    {
      cout<<char(a);
      a++;
    }
    //Numerics
    for(j=1;j<=i;j++)
      cout<<j;
    cout<<endl;
  }
  return 0;
}