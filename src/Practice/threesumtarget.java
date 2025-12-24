
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class threesumtarget {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        int n = arr.length;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==0)
                    {
                        ArrayList<Integer> subList = new ArrayList<>();
                        subList.add(arr[i]);
                        subList.add(arr[j]);
                        subList.add(arr[k]);
                        Collections.sort(subList);
                        if(!mainList.contains(subList))
                        {
                            mainList.add(subList);
                        }

                    }

                }
            }
        }
        System.out.println(mainList);

    }
}
