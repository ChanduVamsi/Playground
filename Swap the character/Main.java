#include <iostream>
#include <string>
using namespace std;

int main() 
{
  string a,b,c;
  cin>>a>>b>>c;
  int i;
  for(i=0;i<a.length();i++)
  {
    if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' || a[i]=='A' || a[i]=='E' || a[i]=='I' || a[i]=='O' || a[i]=='U')
    {
      a[i] = '$';
    }
  }
  for(i=0;i<b.length();i++)
  {
    if(b[i]!='a' && b[i]!='e' && b[i]!='i' && b[i]!='o' && b[i]!='u' && b[i]!='A' && b[i]!='E' && b[i]!='I' && b[i]!='O' && b[i]!='U')
    {
      b[i] = '#';
    }
  }
  for(i=0;i<c.length();i++)
  {
    char ch;
    ch = c[i];
    if(ch>96)
    {
    ch -= 32;
    c[i] = ch;
    }
  }
  cout<<a+b+c;
  return 0;
}