#include <iostream>

using namespace std;

struct students
{
    string name;
    int obtMarks;
    float percentage;
};

struct Author
{
    string author1;
    string author2;
};
struct Books
{
    string b_Name;
    Author authorName;
};

int main()
{
    /*
    students std1;
    cin>>std1.rollno;
    cout<<std1.rollno<<endl;
*/

    students std2 = {"ABC", 75, 80.9F};
    cout<<std2.name;


    /*Books book1;
    book1.b_Name = "C++";
    book1.authorName.author1 = "Ali";
    cout<<book1.b_Name<<endl;
    cout<<book1.authorName.author1;*/
    return 0;
}
