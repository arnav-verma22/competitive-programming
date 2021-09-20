//import java.util.*;
class isarrsorted
{
    public static boolean isarraysorted(int arr[], int n)
    {
        if(n == 1)
            return true;
        boolean restarr = isarraysorted(arr, n-1);
        return (restarr && arr[n-1]>arr[n-2]);
    }

    public static void main(String Args[])
    {
        int arr[] = {4,2,3,4,5,6};
        System.out.println(isarraysorted(arr, 6));
        //String s = "af";
        
    }
}