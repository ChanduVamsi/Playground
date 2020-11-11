#include <iostream>
using namespace std;

int main() 
{
  int i, j, n, asc, space=0;
  cin>>n;
  for(i=0;i<n;i++)
  {
    //spaces
    for (j=0;j<space;j++)
    {
      cout<<" ";
    }
    space += 2;
    char ch = 'A';
    asc = ch;
    for(j=i;j<n;j++)
    {
      cout<<(char)asc<<" ";
      asc++;
    }
    asc--;
    for(j=i;j<n;j++)
    {
      cout<<(char)asc<<" ";
      asc--;
    }
    cout<<endl;
  }
    return 0;
  }
