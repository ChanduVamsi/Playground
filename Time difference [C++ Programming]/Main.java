#include<iostream>
#include<string.h>
#include<limits.h>
using namespace std;

struct Time
{
    int h;
    int m;
    int s;
};
    typedef struct Time TIME;
    int toSeconds(TIME *gt)
    {
        int in_seconds;
        in_seconds = gt->h * 3600 + gt->m * 60 + gt->s;
        return in_seconds;
    }
    int abs(int val)
    {
        if (val < 0) return -val;
        else return val;
    }
int diff_in_times(TIME *t1, TIME *t2)
{
  int i = toSeconds(t1) - toSeconds(t2);
  return abs(i);
}
int main()
{
        TIME t1 = {1,58,42},  t2 = {2,1,45};
        printf("%d", diff_in_times(&t1, &t2));
        return 0;
}
