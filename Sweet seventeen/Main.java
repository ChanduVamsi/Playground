#include <iostream>
#include <string>
using namespace std;

int main()
{
  string s;
  cin>>s;
  char c;
  int i, x=1,res,n=0;
  for(i=s.length()-1; i>=0; i--)
  {
    char c = s[i];
    res = (int) c;
    if(res>=49 && res<65)
      res -= 48;
    else if(res>=65 && res<97)
      res -= 55;
    else
      res -= 87;
    n += res*x;
    x *= 17;
  }
  cout<<n;
  return 0;
}
