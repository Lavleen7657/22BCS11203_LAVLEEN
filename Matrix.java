import java.util.Scanner;
public class Matrix{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of Matrix: ");
        int r = s.nextInt();
        int c = s.nextInt();
        int[][] matrix1 = new int [r][c];
        int[][] matrix2 = new int [r][c];
        int resultMatrix[][] = new int [r][c];
        
        System.out.println("Enter elements for matrix 1: ");
        for(int i=0; i<r; i++){
            for(int j = 0; j<c; j++){
                matrix1[i][j] = s.nextInt();
            }
        }
        
        System.out.println("Enter elements for matrix2: ");
        for(int i=0; i<r; i++){
            for(int j = 0; j<c; j++){
                matrix2[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the operation to be performed: ");
        int a = s.nextInt();
        
        switch(a){
            case 1:
                // Addition of matrices
                System.out.println("\nThe sum of the two matrices is:");
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                        System.out.print(resultMatrix[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            
            case 2:
                // Subtraction of matrices
                System.out.println("\nThe difference of the two matrices is:");
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                        System.out.print(resultMatrix[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            
            case 3:
                // Multiplication of matrices (only if column count of matrix1 equals row count of matrix2)
                if (r == c) {
                    System.out.println("\nThe product of the two matrices is:");
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            resultMatrix[i][j] = 0;
                            for (int k = 0; k < c; k++) {
                                resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                            }
                            System.out.print(resultMatrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Matrix multiplication not possible. Ensure the number of columns in Matrix 1 equals the number of rows in Matrix 2.");
                }
                break;
            
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
        }
        
        s.close();
    }
} 
