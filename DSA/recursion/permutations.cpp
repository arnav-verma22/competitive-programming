#include<iostream>
using namespace std;

// funtion o print all permutations of a string
void permutations(string s, string ans)
{
    if(s.length() == 0)
        cout<<ans<<endl;

    for(int i = 0; i<s.length(); i++)
    {
        char fix = s[i];
        string ros = s.substr(0,i) + s.substr(i+1);
        permutations(ros, ans+fix);
    }
    //cout<<endl;
}

int main()
{
    string s = "abcd";
    permutations(s,"");

}