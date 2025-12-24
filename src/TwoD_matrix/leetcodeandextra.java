package TwoD_matrix;

import java.util.ArrayList;

public class leetcodeandextra {
    public static void main(String[] args) {
        int[][] mat = {
                {1,10,4,2},
                {9,3,8,7},
                {15,16,17,12}
        };
        int row = mat.length;
        int col = mat[0].length;
        ArrayList<Integer> lis = new ArrayList<>();

//        int[][] result = new int[row-2][col-2];
//        for(int i=0; i<row; i++)
//        {
//            for(int j=0;j<col-1;j++)
//            {
//                for(int k=j+1;k<col;k++)
//                {
//                    if(mat[i][j]>mat[i][k])
//                    {
//                        int temp=mat[i][j];
//                        mat[i][j]=mat[i][k];
//                        mat[i][k]=temp;
//                    }
//                }
//            }
//        }
//
//        int sum = 0;
//       for(int i=col-1;i>=0;i--)
//       {
//           int max= 0;
//           for(int j=0;j<row;j++)
//           {
//               if(mat[j][i]>max)
//               {
//                   max=mat[j][i];
//               }
//           }
//           sum+=max;
//       }
//        System.out.println(sum);





//        for (int left = 0; left < row-2; left++)
//        {
//            for (int right = 0; right < col-2; right++)
//            {
//                int max = 0;
//                for (int i = left; i <= left + 2; i++)
//                {
//                    for (int j = right; j <= right + 2; j++)
//                    {
//                        if (mat[i][j] > max)
//                        {
//                            max = mat[i][j];
//                        }
//                    }
//                }
//                result[left][right] = max;
//            }
//        }
//
//        for(int i=0;i<result.length;i++)
//        {
//            for(int j=0;j<result[0].length;j++)
//            {
//                System.out.print(result[i][j]+" ");
//            }
//            System.out.println();
//        }

//        int negcou = 0;
//        int left = 0;
//        int right = mat[0].length-1;
//        while(left<mat.length && right>=0)
//        {
//            if(mat[left][right]<0)
//            {
//                negcou += mat.length-left;
//                right--;
//            }
//            else
//            {
//                left++;
//            }
//        }
//        System.out.println(negcou);



//        for(int i=0;i< mat[0].length;i++)
//        {
//            int max  = 0;
//            int index = -1;
//            for(int j=0;j<mat.length;j++)
//            {
//                if(mat[j][i]>max)
//                {
//                    max = mat[j][i];
//                    index = j;
//                }
//            }
//
//            int k = index;
//            int flag = 0;
//            int j;
//            for( j=0;j<mat[0].length;j++)
//            {
//                if(max>mat[k][j])
//                {
//                    flag = 1;
//                    break;
//                }
//            }
//            if(flag==0)
//            {
//                lis.add(max);
//            }
//        }

        System.out.println(lis);
    }
}
