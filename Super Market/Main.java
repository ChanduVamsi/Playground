#include <iostream>
using namespace std;

class Books
{
  public:
  int books;
  void display()
  {
    cout<<"I Purchased "<<books<<" Books"<<endl;
  }
};

int main() 
{
  Books b1;
  cin>>b1.books;
  b1.display();
  return 0;
}