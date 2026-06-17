import java.util.*;
public class divisor2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int h=sc.nextInt();

        if(n%k==0&&n>l&&n<h){
            System.out.println("Fearful");
        }
        else{
            System.out.println("Cute");
        }
        sc.close();
    }
}
