package Sorting_Algorithm;//Type	Stable?	Time Complexity (Avg)	Description
//        🔸 Bubble Sort	Yes	O(n²)	Repeatedly swaps adjacent elements
//        🔸 Selection Sort	No	O(n²)	Selects min and swaps with front
//        🔸 Insertion Sort	Yes	O(n²)	Inserts elements at correct position
//        🔸 Merge Sort	Yes	O(n log n)	Divide and conquer — splits and merges
//        🔸 Quick Sort	No	O(n log n)	Picks pivot and partitions
//        🔸 Heap Sort	No	O(n log n)	Uses heap data structure
//        🔸 Counting Sort	Yes	O(n + k)	Counts frequency — for integers only
//        🔸 Radix Sort	Yes	O(nk)	Sorts digit by digit (non-comparative)
//        🔸 Bucket Sort	Yes	O(n + k)	Distributes into buckets, then sorts
//        🔸 Shell Sort
import java.util.Arrays;

public class SortingAlgo {

    public  int[] selectionsort(int[] arr) {
        //explation :- find small element in array and move to front .
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static int[] bubblesort(int[] arr) {
        //explation :- find large element in array and move to back.
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static int[] insertionsort(int[] arr) {
        //explation :- start from second element in array and take new element from array and place them to a correct place .
        int n = arr.length;
        for(int i=1;i<n;i++)
        {
            int demo = i;
            for(int j=i-1;j>=0;j--)
            {
                if(arr[i]<arr[j])
                {
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                    i=j;
                }
            }
            i=demo;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {8,1,5,4,9,8,13};
        SortingAlgo algo1 = new SortingAlgo();//because the selection sort are not static so we create object and then call its method

//        System.out.println(Arrays.toString(algo1.selectionsort(arr)));

//        System.out.println(Arrays.toString( bubblesort(arr)));
//        System.out.println(Arrays.toString( insertionsort(arr)));


    }
}
