import java.util.*;
public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        System.out.println("The factors are:");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                c++;
            }
        }
        System.out.println("count= "+c);
    }
}
