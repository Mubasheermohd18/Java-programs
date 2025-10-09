import java.util.Scanner;
public class TwoDArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        System.out.println("Enter elements:");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        }

        for(int i = 0; i < m; i++) {
            int rowSum = 0;
            for(int j = 0; j < n; j++)
                rowSum += arr[i][j];
            System.out.println("Sum of row " + i + " = " + rowSum);
        }

        for(int j = 0; j < n; j++) {
            int colSum = 0;
            for(int i = 0; i < m; i++)
                colSum += arr[i][j];
            System.out.println("Sum of column " + j + " = " + colSum);
        }
        sc.close();
    }
}
