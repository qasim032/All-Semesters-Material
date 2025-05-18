#include <iostream>

using namespace std;

enum days_week {Mon, Tues, Wed, Thu, Fri, Sat, Sun};

int main()
{
    days_week day1=Mon;
	days_week day2=Thu;

	cout<<"day1="<<day1;
	cout<<"\n day2="<<day2;

	cout<<"\n result="<<(day2>day1);
    return 0;
}
