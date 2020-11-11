#include <iostream>
#include <string.h>
using namespace std;

int main()
{
  char str[16][10] = {"break", "case", "continue", "default", "defer", "else","for", "func", "goto", "if", "map", "range", "return", "struct", "type", "var"}; 
  char c[10];
  cin>>c;
  int i,flag=0;
  for(i=0;i<16;i++)
  {
    if((strcmp(c,str[i]))==0)
      
    {
      flag++;
      break;
    }
  }
  if(flag==0)
  {
    cout<<c<<" is not a keyword";
  }
  else
    cout<<c<<" is a keyword";
  return 0;
}