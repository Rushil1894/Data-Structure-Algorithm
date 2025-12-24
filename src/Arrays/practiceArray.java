package Arrays;

public class practiceArray {
    public static void main(String[] args) {
        int[] arr1= {5,5,5,5,5,5,5,5};
        int n = arr1.length;
        int count = 0 ;
        for(int i=0;i<n;i++)
        {
            if(arr1[i]==0)
            {
                count++;
            }
        }
        if(count>1)
        {
            System.out.print("0"+" ");
        }

        for(int i=0;i<n;i++)
        {
            int coun=0;
            if(arr1[i]==0)
            {
                continue;
            }
            else {
                for (int j = i+1; j < n; j++) {
                    if(arr1[i]==arr1[j])
                    {
                        coun++;
                        arr1[j]=0;
                    }
                }
            }
            if (coun>=1){
                System.out.print(arr1[i]+" ");
            }
        }

    }
}
