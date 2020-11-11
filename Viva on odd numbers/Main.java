#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int i=0, count=0;
  float score=0;
  while(i>=0 && count<3)
  {
    cin>>i;
    if(i>=0)
    {
    	if(i%2!=0)
    	{
    	  score++;
    	  count++;
    	}
      else
        score -= 0.5;
    }
    else
    {
      score--;
    }
  }
  cout<<fixed<<setprecision(1)<<score;
  return 0;
}