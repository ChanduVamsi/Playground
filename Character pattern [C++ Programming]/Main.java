#include<iostream>
using namespace std;

void printpattern(int n)
{
	//Your code goes here
  for(int i=1; i<=n; i++)
  {
    for(int j=1;j<=i;j++)
    {
      if((j&1)==1)
        cout<<"*";
      else
        cout<<"#";
    }
    cout<<endl;
  }
}


int main()
{
    int a;
    cin>>a;
    printpattern(a);
    return 0;
}
