#include <iostream>
#include <string>
using namespace std;

int main() 
{
  string s;
  getline(cin,s);
  int i,j,len = s.size();
  for(i=0;i<len;i++)
  {
    for(j=0;j<len;j++)
    {
      if(i==j || i+j==len-1)
        cout<<s[j];
      else
        cout<<" ";
    }
    cout<<endl;
  }
  return 0;
}