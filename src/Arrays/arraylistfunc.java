package Arrays;

import java.util.ArrayList;

public class arraylistfunc {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(30);
        arrayList.add(20);
        arrayList.add(10);
        arrayList.add(40);

//        System.out.println(arrayList);
        insertionsort(arrayList);
//        updatelist(arrayList,20,200);
        deletefromlist(arrayList, 30);
//        System.out.println(search( arrayList,20));
//        print(arrayList);
    }

    public static ArrayList<Integer> insertionsort(ArrayList<Integer> arrayList)
    {
        int n = arrayList.size();
        for(int i=1;i<n;i++)
        {
            int demo = i;
            for(int j=i-1;j>=0;j--)
            {
                if(arrayList.get(i) < arrayList.get(j))
                {
                    int temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, temp);
                    i=j;
                }
            }
            i=demo;
        }
        return arrayList;
    }

    public static void updatelist(ArrayList<Integer> arrayList,int oldvalue,int newvalue)
    {
        int n = arrayList.size();
        for(int i=0;i<n;i++)
        {
            if(oldvalue==arrayList.get(i))
            {
                arrayList.set(i, newvalue);
                break;
            }
        }
        System.out.println(insertionsort(arrayList));
    }

    public static boolean search(ArrayList<Integer> arrayList,int fin)
    {
        int left = 0;
        int right = arrayList.size()-1;
        while(left<=right)
        {
            int mid  = (left +right)/2;
            if(arrayList.get(mid)==fin)
            {
                return true;
            }
            else if (mid>fin)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return false;

    }

    public static void print(ArrayList<Integer> arrayList)
    {
          for(int var : arrayList)
          {
              System.out.print(var + " ");
          }
    }

    public static void deletefromlist(ArrayList<Integer> arrayList,int value)
    {
        int n = arrayList.size();
        for(int i=0;i<n;i++)
        {
            if(value==arrayList.get(i))
            {
                arrayList.remove(i);
                break;
            }
        }
        System.out.println(arrayList);
    }
}
