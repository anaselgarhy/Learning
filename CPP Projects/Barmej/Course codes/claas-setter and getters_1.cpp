#include <iostream>
#include <iomanip>
using namespace std;

class Time
{
private:
    short hour;
    short minute;
    short second;

public:
    Time(short h, short m, short s)
    {
        hour = h;
        minute = m;
        second = s;
    }
    // Setter and getter to hour
    void setHour(short h)
    {
        if(h>0 && h<13)
            hour = h;
    }
    short getHour()
    {
        return hour;
    }
    // Setter and getter to minute
    void setMinute(short m)
    {
        if(m>=0 && m<61)
            minute = m;
    }
    short getMinute()
    {
        return minute;
    }
    // Setter and getter to second
    void setSecond(short s)
    {
        if(s>=0 && s<61)
            second = s;
    }
    short getSecond()
    {
        return second;
    }
    // Print function
    void print()
    {
        cout << setfill('0');
        cout << setw(2) << hour << ':' << setw(2) << minute << ':' << setw(2) << second << endl;
    }
};
int main(void)
{
    Time time(6, 26, 4);
    time.print();
    time.setHour(55);
    time.print();
    time.setMinute(27);
    time.setSecond(32);
    time.print();
    cout << setfill('-') << setw(10) << "" << endl;
    cout << "Hour: " << time.getHour() << endl
         << "Minute: " << time.getMinute() << endl
         << "Second: " << time.getSecond() << endl;
    return 0;
}
