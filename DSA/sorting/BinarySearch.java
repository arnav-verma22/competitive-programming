public class BinarySearch {
    static int search(int[] arr, int x)
    {
        if(arr[0] == x)
            return 0;
        
        int n = arr.length;
        int index = n/2;
        int s = 0, e = n;

        while (arr[index] != x) {
            System.out.println(index);
            if(arr[index] > x)
            {
                System.out.println("inside index > x");
                e = index;
                index = (s+e)/2;
                
                continue;
                
            }
            else if(arr[index] < x)
            {
                System.out.println("inside index < x");
                s = index;
                index = (s+e)/2;
                
                
            }
        }
        
        return index;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 7, 10, 15, 17, 23, 40 };
        System.out.println(search(arr, 17));
    }
}
