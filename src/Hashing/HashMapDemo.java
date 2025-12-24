package Hashing;

import java.util.*;

public class HashMapDemo
{
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<String,Integer>();

        //insertion
        mp.put("Rushil",90);
        mp.put("Rahul",97);
        mp.put("Raj",80);
        mp.put("Prince",87);
        mp.put("Prince",91);

        //viewing data
        System.out.println(mp.get("Rushil"));
        System.out.println(mp.get("Rahul"));
        System.out.println(mp.get("Raj"));
        System.out.println(mp.get("Prince"));

        //search
        if(mp.containsKey("Jay"))
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        //creating set and then fetch data
        //approach 1
        Set<String> set = mp.keySet();
        for(String s :set)
        {
            System.out.println(s +" "+ mp.get(s));
        }
        //approach 2
        Set<Map.Entry<String, Integer>> entriesset = mp.entrySet();
        for(Map.Entry<String, Integer> s : entriesset)
        {
            System.out.println(s.getKey() + " "+ s.getValue());
        }

        //and if we want to see direct from sout then also work

        System.out.println(mp);

        //and if we want to create new data by giving default value then ..
        HashMap<Integer,Integer> mp2 = new HashMap<>();
            mp2.put(1, mp.getOrDefault(1,1)*5);
        mp2.put(2, mp.getOrDefault(2,2)*5);
        mp2.put(3, mp.getOrDefault(3,3)*5);
        mp2.put(2, mp.getOrDefault(2,2)*5);

        System.out.println(mp2);

    }
}
