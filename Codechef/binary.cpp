#include<iostream>
using namespace std;

/*int binary(string s)
{
    int bl[9];


}*/

int main()
{
    string name, surname;
    int bl[9] = {0};
    cin>>name>>surname;
    cout<<name<<surname;
    for(int i = 0; i < 9; i++)
    {
        cout<<bl[i]<<"\n";
    }
}
