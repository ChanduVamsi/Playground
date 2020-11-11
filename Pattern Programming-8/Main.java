#include<iostream> 
using namespace std; 

int main() 
{ 
	int i,j,n,p,q=1;
    cin>>n;	
    for(i = 1; i <= n; i++) 
	{  
		if(i%2!=0) 
		{ 
			q += i - 1; 
			for(j=1; j<=i; j++) 
			{ 
				if(j==1) 
                  cout<<q;
				else
				  cout<<"*"<<q; 
				q++;	 
			} 
		} 
		else
		{		 
			p = q + i -1; 
			for(int j=1; j<=i; j++) 
			{ 
				if(j==1) 
					cout<<p; 
				else
					cout<<"*"<<p; 
				p--; 
			} 
		} 
		cout<<endl; 
	}	
	return 0; 
} 
