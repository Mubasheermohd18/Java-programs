import java.util.*;
public class conditionalstatement3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int h=sc.nextInt();

        if(n%k==0){
            if(n>l){
                if(n<h){
                    System.out.println("Fearful");
                }
                else{
                    System.out.println("Cute");
                }
            }
            else{
                System.out.println("Cute");
            }
        }
        else{
            System.out.println("Cute");
        }
        sc.close();
    }
}