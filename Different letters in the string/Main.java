#include <iostream>
#include <string>
using namespace std;

int main() 
{
  string s,r;
  cin>>s>>r;
  int i,j,count=0;
  for(i=0,j=0;i<s.size();i++,j++)
  {
    if(s[i]!=r[j])
    {
      cout<<s[i];
      j--;
      count++;
    }
  }
  if(count==0) cout<<"NA";
  return 0;
}