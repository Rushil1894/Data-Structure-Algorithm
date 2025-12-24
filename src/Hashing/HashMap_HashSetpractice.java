package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMap_HashSetpractice
{
    public static void main(String[] args)
    {
        int[] arr = {-2,-4,3,5,4,7};
        int[] arr2 = {-2,-4,3,5,4,7};


//        Print_all_distinct(arr);
//        Print_all_the_duplicate(arr);
//        Print_all_unique_numbers(arr);
//        array2_is_subset_of_array1 (arr,arr2);
//        frequency_of_each_number(arr);
//        Sum_exists_in_unsorted_Array(arr2 , 2);
//        Most_frequent_element(arr);
//        two_arrays_are_equalor_not(arr,arr2);

    }

    private static void two_arrays_are_equalor_not(int[] arr,int[] arr2)
    {

        if(arr.length != arr2.length )
        {
            System.out.println("not same");
            return;
        }

        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
        {
            if(!(hm.containsKey(arr[i])))
            {
                hm.put(arr[i] , 1);
            }
            else
            {
                int k = hm.get(arr[i]);
                hm.put(arr[i] , k+1);
            }
        }

        for (int i = 0; i < arr2.length; i++)
        {
            if(hm.containsKey(arr2[i]) && hm.get(arr2[i]) > 0)
            {
                    int k = hm.get(arr[i]);
                    hm.put(arr[i] , k-1);
            }
            else {
                System.out.println("not same");
                return;
            }
        }
        System.out.println("same");


    }

    private static void Most_frequent_element(int[] arr)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
        {
            if(!(hm.containsKey(arr[i])))
            {
                hm.put(arr[i] , 1);
            }
            else
            {
                int k = hm.get(arr[i]);
                hm.put(arr[i] , k+1);
            }
        }

//        System.out.print(hm);
        int max  = 0;
        int val = 0;
        for(Integer es : hm.keySet())
        {
//            System.out.print(es.getKey() + ":" + es.getValue() + " ");
            if(hm.get(es) > max)
            {
                max = hm.get(es);
                val = es;
            }
        }
        System.out.println(val);
    }

    private static void Sum_exists_in_unsorted_Array(int[] arr2,int sum)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr2.length; i++)
        {
            if(!(hm.containsKey(arr2[i])))
            {
                hm.put(arr2[i] , 1);
            }
            else
            {
                int k = hm.get(arr2[i]);
                hm.put(arr2[i] , k+1);
            }
        }

        for (int i = 0; i < arr2.length; i++)
        {
            int x  = Math.abs(arr2[i]-sum);
            if(hm.containsKey(x))
            {
                if(hm.get(x) > 1)
                {
                    System.out.println("True");
                    return;
                }
            }
        }
        System.out.println("False");
    }

    private static void frequency_of_each_number(int[] arr)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
        {
            if(!(hm.containsKey(arr[i])))
            {
                hm.put(arr[i] , 1);
            }
            else
            {
                int k = hm.get(arr[i]);
                hm.put(arr[i] , k+1);
            }
        }

//        System.out.print(hm);
        for(Map.Entry<Integer,Integer> es : hm.entrySet())
        {
            System.out.print(es.getKey() + ":" + es.getValue() + " ");
        }

    }

    private static void array2_is_subset_of_array1(int[] arr, int[] arr2)
    {
        HashSet<Integer> hs = new HashSet<>();
//        HashSet<Integer> dup = new HashSet<>();
        for (int i = 0; i < arr.length; i++)
        {
            hs.add(arr[i]);
        }
        for (int i = 0; i < arr2.length; i++)
        {
            if(!(hs.contains(arr2[i])))
            {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }

    private static void Print_all_unique_numbers(int[] arr)
    {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();

        for (int i = 0; i < arr.length; i++)
        {
            if(hs.contains(arr[i]))
            {
                if(dup.contains(arr[i]))
                {
                    dup.remove(arr[i]);
                }
                else{
                    continue;
                }
            }
            else{
                hs.add(arr[i]);
                dup.add(arr[i]);
            }
        }
        System.out.println(dup);
    }

    private static void Print_all_the_duplicate(int[] arr)
    {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();

        for (int i = 0; i < arr.length; i++)
        {
             if(hs.contains(arr[i]))
             {
                 dup.add(arr[i]);
             }
             else {
                 hs.add(arr[i]);
             }
        }

        System.out.println(dup);


    }

    public static void Print_all_distinct(int[] arr)
    {
        HashSet<Integer> hs = new HashSet<>();
//        hs.add(10);
//        hs.add(20);
//        hs.add(30);
//        hs.add(40);
//        System.out.print(hs);
        for(int i=0 ; i<arr.length;i++)
        {
            hs.add(arr[i]);
        }
//        System.out.print(hs);
        for(int ele : hs)
        {
            System.out.print(ele + " ");
        }
    }
}

