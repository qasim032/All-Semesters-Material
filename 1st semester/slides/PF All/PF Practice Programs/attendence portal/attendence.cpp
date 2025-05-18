#include <iostream>
#include <conio.h>
#include <fstream>
using namespace std;

int main()
{
    string subject;
    cout << "Enter the name of subject ";
    getline(cin, subject);
    cout<<"Subject : "<<subject<<endl;
    ofstream out("attendence.txt", ios::app);
    string date;
    cout << "Enter date " << endl;
    getline(cin, date);
    out << endl << endl << "Attendence of 24BSAI" << endl;
    out<<"Subject : "<<subject<<endl; 
    out << "DATE : " << date;
    cout << " ATTENDANCE PORTAL 24BSAI " << endl;
    cout << "Date :" << date << endl;
    cout << "Subject :" << subject << endl;
    const int totalStudents = 56;
    int roll, presentCount = 0, absentCount = 0;
    int present[totalStudents], absent[totalStudents];
    char c;

    for (roll = 1; roll <= totalStudents; roll++)
    {
        cout << "24BSAI0" << roll << " (p/a): ";
        c = getch();
        cout << c << endl;

        if (c == 'p' || c == 'P')
        {
            present[presentCount++] = roll;
            cout << "24BSAI0" << roll << " is Present" << endl;
        }
        else if (c == 'a' || c == 'A')
        {
            absent[absentCount++] = roll;
            cout << "24BSAI0" << roll << " is Absent" << endl;
        }
        else
        {
            cout << "Invalid key! Please choose (p/a)." << endl;
            roll--;
        }
    }

    cout << "\nPresent Count: " << presentCount << endl;
    cout << "Roll numbers of students present: ";
    out << "\nPresent Count: " << presentCount << endl;
    out << "Roll numbers of students present: ";

    for (int i = 0; i < presentCount; i++)
    {
        cout << "24BSAI0" << present[i] << " ";
        out << "24BSAI0" << present[i] << " ";
    }

    cout << "\nAbsent Count: " << absentCount << endl;
    cout << "Roll numbers of students absent: ";
    out << "\nAbsent Count: " << absentCount << endl;
    out << "Roll numbers of students absent: ";

    for (int i = 0; i < absentCount; i++)
    {
        cout << "24BSAI0" << absent[i] << " ";
        out << "24BSAI0" << absent[i] << " ";
    }
    cout << endl;
    out.close();

    return 0;
}