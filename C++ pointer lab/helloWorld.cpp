#include <iostream>
using namespace std;

int main() {
  cout << "Hello World!"<<endl;
  int x = 5;
  int* y = &x; //get address for x
  *y = 182; //the thing pointed to by y
  cout <<"x:"<< x << endl;//new print statement
  cout <<"y:"<<y <<endl;
  cout <<"*y:" <<  *y <<endl;
  cout << "&x : " << &x << endl; //pointer to x
  cout << "y : " << y << endl; //pointer to x and y??


  int a[] = {1,2,3};
  int size= sizeof(a)/sizeof(a[0]);



  //search array a for value 2 in a[1] and value 5 (not there)
  //&a
  for(int *p = a; p < &a[size]; p++){
    cout << "a : " << *p << endl;

  
  
    if(*p == 2){
      cout<< "success" <<endl;
      }
    else {
      cout << "not there" << endl;
    }
  }
  

  return 0;

}
