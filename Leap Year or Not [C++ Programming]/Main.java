
#include<bits/stdc++.h>
using namespace std;

int main() {   
  int year;  

  cin>>year; 

  if( year%4==0) 
  {
    if(year%400==0)
      cout<<"Leap Year";
    else if(year%100==0)
      cout<<"Not Leap Year";
    else
      cout<<"Leap Year";
  }  
  else 
  {      
	cout<<"Not Leap Year";  
  } 
} 