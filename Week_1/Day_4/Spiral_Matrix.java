package Week_1.Day_4;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m =  matrix[0].length;
        int left = 0 , right = m-1 , top = 0 , bottom = n-1 ;
        List<Integer>  list = new ArrayList<Integer>();
        int c = 0 , total = n*m ;
        while(c < total) {
            for (int i = left; i <= right && c < total; i++) {
                list.add(matrix[top][i]);
                c++;
            }
            top++;
            for (int i = top; i <= bottom && c < total; i++) {
                list.add(matrix[i][right]);
                c++;
            }
            right--;
            for (int i = right; i >= left && c < total; i--) {
                list.add(matrix[bottom][i]);
                c++;
            }
            bottom--;
            for (int i = bottom; i >= top && c < total; i--) {
                list.add(matrix[i][left]);
                c++;
            }
            left++;

            }

        return list;
        }

    }



