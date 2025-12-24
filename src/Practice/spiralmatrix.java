public class spiralmatrix {
    public static void main(String[] args) {
        int k = 4;
        int[][] mat = new int[k][k];
        int row  = mat.length;
        int col = mat[0].length;

        int left  = 0;
        int right = row-1;
       int top  = 0;
       int bottom = col-1;
       int l = 1;

       while(left<=right && top<=bottom)
       {
           int var = left;
           while(var <= right)
           {
               mat[top][var] = l;
               var ++;
               l++;
           }
           top++;
           var = top;
           while(var <= bottom)
           {
               mat[var][right] = l;
               var++;
               l++;
           }
           right--;

           var = right;
           while(var >= left)
           {
               mat[bottom][var] = l;
               var--;
               l++;
           }
           bottom--;
           var = bottom;
           while(var >= top)
           {
               mat[var][left] = l;
               var--;
               l++;
           }
           left++;
       }

    }
}
