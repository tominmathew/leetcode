import java.util.ArrayList;
import java.util.List;

public class MatrixZero {

    public static void main(String[] args) {
        int[][] matrix = {{2,4,6},{2,0,5},{5,6,1}};
        System.out.println("Befor: ");
        MatrixZero.printMatrix(matrix);
        MatrixZero.matrixZero(matrix);
        System.out.println("After: ");
        MatrixZero.printMatrix(matrix);
    }

    public static void matrixZero(int[][] matrix){
    List<Integer> rows = new ArrayList<>();   
    List<Integer> columns = new ArrayList<>();     
        for(int i=0; i<matrix.length; i++){
            for(int j =0;j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j =0;j<matrix[0].length; j++){
                if(rows.contains(i) || columns.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // For new line after each row
        }
    }
}
