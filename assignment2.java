package assignment2;
import java.util.*;
public class assignment2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter row and column:");
        int r = sc.nextInt();  //for row
        int c = sc.nextInt();  //for column
        int[][] m = new int[r][c];
        creatRandomMatrix(m, r, c);
        printMatrix(m,r,c);
        System.out.println("Enter r for row and c for column and number for sort:\n (like c1 or r0)");
        String s = sc.nextLine();
        s = sc.nextLine();
        char ch ,ch1;
        int n;
        ch = (char) s.charAt(0);
        n = (int)s.charAt(1);
        n -= 48;

        if (ch == 'r' && n < r) {
            sortRow(m,r,n,c);
        }
        else if (ch == 'c' && n < c) {
            sortcolumn(m,r,n,c);
        }
        else {
            System.out.println("ERROR");
        }
    }
    public static void creatRandomMatrix(int m[][], int r, int c) {
        Random random = new Random();
        //set random matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = random.nextInt(100);
            }
        }
    }
    public static void printMatrix(int m[][],int r,int c){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("%4d", m[i][j]);
            }
            System.out.println();
        }
    }
    public static void sortRow (int m[][],int r,int n,int c){

        for(int i = r-2 ; i >= 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if(m[n][j] > m[n][j+1]){
                    int temp = m[n][j];
                    m[n][j] = m[n][j+1];
                    m[n][j+1] = temp;
                }
            }
        }
        printMatrix(m,r,c);
    }
    public static void sortcolumn (int m[][],int r,int n,int c) {
        for (int i = c-2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (m[j][n] > m[j + 1][n]) {
                    int temp = m[j][n];
                    m[j][n] = m[j + 1][n];
                    m[j + 1][n] = temp;
                }
            }
        }
        printMatrix(m, r, c);
    }
}
