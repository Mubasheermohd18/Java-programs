import java.util.*;

public class arrayreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        int rev[]=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            rev[j]=arr[i];
            j++;
        }
        /*for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;  
            }
            n--;
        }*/
         for(int i=0;i<n;i++){
            System.out.print(rev[i]+" ");
        }

        sc.close();

    }
}
