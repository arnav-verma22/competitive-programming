import java.util.*;
public class MergeSort {

    static void show(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    static void merge(int[] arr1, int[] arr2)
    {
        int[] sorted = new int[arr1.length+arr2.length];
        int i = 0, j = 0;
        while(true)
        {
            if(i == arr1.length)
            {
                sorted[i+j] = arr2[i];
                j++;
            }
            

            if(arr1[i] < arr2[j])
            {
                sorted[i+j] = arr1[i];
                i++;
            }
            if(arr1[i] > arr2[j])
            {
                sorted[i+j] = arr2[i];
                j++;
            }
        }
    }

    static void sort(int[] arr)
    {
        //show(arr);
        if (arr.length == 1) {
            return;
        }

        int n = arr.length;
        int pos = (n+1)/2;

        int[] b = Arrays.copyOfRange(arr, 0, pos);

        int[] c = Arrays.copyOfRange(arr, pos, n);

        show(b);
        show(c);
        sort(b);
        
        sort(c);
        
        
        merge(b, c);


    }
    public static void main(String[] args) {
        
        int[] array = {6,3,9,5,2,8,7,1};
        sort(array);
    }
}
