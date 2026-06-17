import java.util.*;
public class divisor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();

        if(k%n==0){
            System.out.println("Wow");
        }
        else{
            System.out.println("NotSoWow");
        }
        sc.close();
        
    }
}
