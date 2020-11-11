#include<bits/stdc++.h>
#include <iostream>
using namespace std;

int main()
{ 
long int fact = 1, n, i;
cin>>n;

for(i =2; i <= n; i++)
{
     fact = fact * i;
}

cout<<fact; 
return 0;
}
