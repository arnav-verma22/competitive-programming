import java.util.*;
public class MergeSort {

    static void show(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    static int[] merge(int[] arr1, int[] arr2)
    {
        int[] sorted = new int[arr1.length+arr2.length];
        int i = 0, j = 0;
        while(i != arr1.length || j != arr2.length)
        {
            //System.out.println(i+" "+j);
            if(i == arr1.length)
            {
                //System.out.println(arr2[j]);
                sorted[i+j] = arr2[j];
                j++;
                continue;
            }
            if(j == arr2.length)
            {
                //System.out.println(arr1[i]);
                sorted[i+j] = arr1[i];
                i++;
                continue;
            }

            if(arr1[i] < arr2[j])
            {
                sorted[i+j] = arr1[i];
                i++;
                continue;
            }
            if(arr1[i] > arr2[j])
            {
                sorted[i+j] = arr2[j];
                j++;
            }
        }
        //show(sorted);
        return sorted;
    }

    static int[] sort(int[] arr)
    {
        //show(arr);
        if (arr.length == 1) {
            return arr;
        }

        int n = arr.length;
        int pos = (n+1)/2;

        int[] b = Arrays.copyOfRange(arr, 0, pos);

        int[] c = Arrays.copyOfRange(arr, pos, n);

        show(b);
        show(c);
        int[] sorted1 = sort(b);
        
        int[] sorted2 = sort(c);
        
        
        int[] merged = merge(sorted1, sorted2);
        show(merged);
        return merged;

    }
    public static void main(String[] args) {
        
        int[] array = {6,3,9,5,2,8,7,1};
        //int[] arr1 = {3,5,6,9};
        //int[] arr2 = {1,2,7,8};
        show(sort(array));
        //merge(arr1, arr2);
    }
}
