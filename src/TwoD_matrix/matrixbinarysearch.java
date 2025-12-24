package TwoD_matrix;

public class matrixbinarysearch {
    public static void main(String[] args) {
        int[][] mat  = {
                //forquestion 1
                {1,10,25,50},
                {3,12,27,60},
                {6,15,29,61},
                {9,17,32,65}

                //forquestion 2
//                {1,5,9,10},
//                {18,21,28,30},
//                {45,48,49,50},
//                {61,68,72,80}
        };

        int row = mat.length;
        int col = mat[0].length;
        int k = 15;


        findvalueinsortedrowcolmatrix(mat,row,col,k);
//        findvalueinsortedlinearwisematrix(mat, k);


    }


    public static void findvalueinsortedrowcolmatrix(int[][] mat, int row,int col,int k)
    {
//        for(int i=0; i<row; i++)
//        {
//            int low = 0;
//            int high= col-1;
//            while(low<=high)
//            {
//                int mid  = (low+high)/2;
//                if(mat[i][mid]==k)
//                {
//                    System.out.println("present");
//                    return;
//                }
//                else if (mat[i][mid]<k)
//                {
//                    low = mid+1;
//                }
//                else {
//                    high = low-1;
//                }
//            }
//        }
//        System.out.println("not present");

        int i = 0;
        int j = col-1;
        while(i<row && j>=0)
        {
            if(mat[i][j]==k)
            {
                System.out.println("Present");
                return;
            }
            else if (mat[i][j]>k)
            {
                j--;
            }
            else {
                i++;
            }
        }
        System.out.println("Not Present");
    }

    public static void findvalueinsortedlinearwisematrix(int[][] mat,int k)
    {
         int low = 0;
         int high = mat.length*mat[0].length-1;
         while(low<=high)
         {
             int mid = (low+high)/2;
             int row = mid/mat.length;
             int col = mid%mat[0].length;

             if(mat[row][col]==k)
             {
                 System.out.println("Present");
                 return;
             }
             else if (mat[row][col]<k)
             {
                 low = mid + 1;
             }
             else {
                 high = mid-1;
             }
         }
        System.out.println("Not Present");
    }
}
