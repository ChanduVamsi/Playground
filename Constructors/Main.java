#include <iostream> 
using namespace std; 
class Employee 
{ 
	public: 
	int id; 	
	Employee() 
	{ 
		cout<<"Default Constructor called"<<endl; 
		id=5; 
	} 	
	Employee(int x) 
	{ 
		cout<<"Parametrized Constructor called"<<endl; 
		id=x; 
	} 
}; 
int main() 
{ 
	Employee obj1; 
	cout<<"Employee id is : "<<obj1.id<<endl; 
	Employee obj2(21); 
	cout<<"Employee id is : "<<obj2.id; 
	return 0; 
} 
