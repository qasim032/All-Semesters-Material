#include <iostream>

using namespace std;

class MyClass
{

  public :   // access specifier

	void DisplayMsg()
	{
    	cout<<"Welcome to Class 24BSAI"<<endl;

    }// end method

}; // end class

/*
class Students
{

private:
	    string student_rollno; // instance variable

public:
	   void set_rollno(string rollno)
{
	 student_rollno = rollno;
}  // end method

 	 string get_rollno()
{
 return student_rollno;
}  // end method


} ;  // end class

*/

int main()
{

    // Creating an object  of MyClass
    MyClass MyObj; // Instantiating an object of MyClass
    MyObj.DisplayMsg();

    // Creating an object  and asdign it to objStd

/*Students objStd;
// calling objStd’s method set_rollno()

objStd.set_rollno("24BSAI01");

// calling objStd’s method get_rollno()

 cout<<"Welcome "<<objStd.get_rollno()<<endl;
*/
    return 0;
}
