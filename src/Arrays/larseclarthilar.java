public class larseclarthilar {
    public static void main(String[] args) {
        int [] arr ={15,7,9,4,8,2,13,0};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int seclar = Integer.MIN_VALUE;
        int thilar = Integer.MIN_VALUE;
       if(n<3)
       {
           System.out.println("not enough element ...");
           return;
       }
       else
       {
           for(int i=0;i<n;i++)
           {
               if(arr[i]>max)
               {
                   thilar=seclar;
                   seclar=max;
                   max=arr[i];
               }
               else if (arr[i]>seclar && arr[i]!=max)
               {
                   thilar=seclar;
                   seclar=arr[i];
               }
               else if (arr[i]>thilar && arr[i]!=max && arr[i]!=seclar)
               {
                   thilar=arr[i];
               }

           }
       }
        System.out.println("large:" + max +" seclarge:" + seclar +" thirdlarge:" +thilar);
    }
}
