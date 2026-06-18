import java.util.Scanner;

public class simpleprimecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(n==1){
            System.out.println("1 is not a prime");
        }
        else{
            if(c==2){
                System.out.println("it is a prime");
            }
            else{
                System.out.println("not a prime");
            }
        } 
    }
}
    



