import java.util.Scanner;

public class Spiralorder {
    public static void main(String[] args) {
        //List<Integer> ls = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of m and n");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("enter array elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
       /* public List<Integer> list(int[][] arr){
            List<Integer> ls = new ArrayList<>();
            int m = arr.length;
            int n = arr[0].length;
            int sRow = 0;
            int eRow = m - 1;
            int sCol = 0;
            int eCol = n - 1;

            while (sRow <= eRow && sCol <= eCol) {
                //first Row
                for (int j = sCol; j <= eCol; j++) {
                    ls.add(arr[sRow][j]);
                }
                sRow += 1;
                //last column
                for (int i = sRow; i <= eRow; i++) {
                    ls.add(arr[i][eCol]);
                }
                eCol -= 1;
                //last Row
                if (sRow <= eRow) {
                    for (int j = eCol; j >= sCol; j--) {
                        ls.add(arr[eRow][j]);
                    }
                    eRow -= 1;
                }
                //first column
                if (sCol <= eCol) {
                    for (int i = eRow; i >= sRow; i--) {
                        ls.add(arr[i][sCol]);
                    }
                    sCol += 1;
                }
            }
            return ls;
        }

    }
}

        */
    }
}