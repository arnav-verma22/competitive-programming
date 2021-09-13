#include<iostream>
using namespace std;

/* suppoese a an array you have to find no. of ways from any point of array to reach the end
and the no. of steps you can take is based on dice i.e max 6 & min 1
so if you notice no of ways from 0th pos to 3rd pos is sum of no. of ways from(1-3,2-3,3-3)
and then we can apply recursion, its somewhat like fibonaci
if you didnt understand refer 
https://www.youtube.com/watch?v=9rt-hFcXd0M&list=PLfqMhTWNBTe0b2nM6JHVCnAkhQRGiZMSJ&index=43
*/

int totalways(int s, int e)
{
    if(s==e)
        return 1;

    if(s > e)
        return 0;
    
    int count = 0;
    for(int i = 1; i<6; i++)
    {
        count += totalways(s+i,e);
    }
    return count;
}

int main()
{
    cout<<totalways(0,3)<<endl;

}