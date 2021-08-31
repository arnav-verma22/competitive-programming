#include<iostream>
using namespace std;

void checkarray(int arr[], int n)
{
    for(int i = 0; i<n; i++)
    {
        cout<<arr[i]<<' ';
    }
    cout<<endl;
}

int main()
{
    int arr[] = {1,2,3,4,5,6};

    //checkarray(arr, 6);
    //checkarray(arr+1, 5);
    string s = "a";
    cout<<s.substr(1)<<endl;
}