#include <iostream>
using namespace std;

class Student
{
  public:
  string name;
  int id;
  void display()
  {
    cout<<"Student is: "<<name<<"\nStudent id is: "<<id;
  }
};

int main() 
{
  Student s;
  cin>>s.name>>s.id;
  s.display();
  return 0;
}