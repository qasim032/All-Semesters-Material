#include <iostream>

using namespace std;

void display()
{
    cout<<"C++ Programming!"<<endl;
}

void display (string firstName)
{
    string  str= firstName;
    cout<<str<<endl;
}
void display (string Rollno, int age)
{
    cout<<Rollno<<" "<<age<<endl;
}
string name(string myName = "Fahama")
{
    cout<<"My name is: "<<myName<<endl;
}

void showData(string fname, string lname)
{
    string str = fname+ " " +lname;
    cout<<str<<endl;
}

int add(int a, int b)
{
    cout<<a+b<<endl;
}

int myFunction(int x)
{
    return 5 + x;
}

//returning by reference
void modifyStr(string &str)
{
  str = str + " World!";
}

int main()
{
    //display();
    //display("Fahama");
    //display("20BSAI__", 20);

    string greeting = "Hello";
    modifyStr(greeting);
    cout << greeting;

    //name();
    //showData("Fahama", "Barakzai");
    //add(3,4);
    //cout<<myFunction(3);

    return 0;
}
