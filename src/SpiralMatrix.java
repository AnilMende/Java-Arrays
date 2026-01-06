import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int toatalRows = matrix.length;
        int toatalCols = matrix[0].length;
        System.out.println("Total Rows " + toatalRows);
        System.out.println("Total Cols " + toatalCols);

        System.out.println((spiral(matrix)));
    }

    static List<Integer> spiral(int matrix[][]){

        ArrayList<Integer> list = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0;
        int right = cols - 1;
        int bottom = rows - 1;
        int left = 0;

        while(left <= right && top <= bottom){

            for(int i=left;i <= right;i++){
                list.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i <= bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                for(int i=right;i >= left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                for(int i=bottom;i >= top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}
