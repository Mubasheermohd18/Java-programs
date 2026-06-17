import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int pr=sc.nextInt();
        float rate=sc.nextFloat();
        int time=sc.nextInt();

        float si=(pr*time*rate)/100;
        float total= pr+si;

        System.out.printf("interest= %.2f\n",si);
        System.out.printf("Total amount= %.2f",total);

        sc.close();

    }
}
