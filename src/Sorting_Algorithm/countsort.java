package Sorting_Algorithm;

import java.util.Arrays;

public class countsort {
    public static void main(String[] args) {
        int[] arr= {5,4,9,8,3,5,2,4,2};
        int n = arr.length;
        int max= 0 ;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int[] count= new int[max+1];
        int[] output= new int[n];

        for(int i=0;i<n;i++)
        {
            count[arr[i]]++;
        }


        int index= 0;
        for(int i=0;i<count.length;i++)
        {
            if(count[i]==0)
            {
                continue;
            }
            else {
               while(count[i]!=0)
               {
                   output[index]=i;
                   count[i]--;
                   index++;
               }
            }
        }
        System.out.println(Arrays.toString(output));


    }
}
