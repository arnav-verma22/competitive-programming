#include <iostream>
#include <bits/stdc++.h>
#include <string>
using namespace std;

int binary(int x)
{
    int bl[9] = {0};
    while(x != 0)
    {
        int y = floor(log2(x));
        bl[8 - y] = 1;
        x = x - pow(2, y);   
    }
    stringstream ss;
    for (unsigned i = 0; i < 9; ++i) 
        ss << bl[i];
    ss >> x;
    return x;
}

bool isSubSequence(string str1, string str2,
                                 int m, int n)
{
     
    // Base Cases
    if (m == 0)
        return true;
    if (n == 0)
        return false;
 
    // If last characters of two
    // strings are matching
    if (str1[m - 1] == str2[n - 1])
        return isSubSequence(str1, str2, m - 1, n - 1);
 
    // If last characters are
    // not matching
    return isSubSequence(str1, str2, m, n - 1);
}

int main()
{
    //string name, surname;
    //int bl[9] = {0};
    //cin>>name>>surname;    
    for(int i; i < 15; i++)
    {
        stringstream ss, sk;
        string x, y; 
        ss << 1001011;
        ss >> x;
        sk << binary(i);
        sk >> y;
        cout<<i<<" - "<<binary(i)<<" - "<<isSubSequence(y, x, y.length(), x.length())<<endl;
    }
}
