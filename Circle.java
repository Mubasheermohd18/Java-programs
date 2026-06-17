import java.util.*;
public class Circle {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int d=sc.nextInt();

        float r=(float)d/2;
        double area=Math.PI*r*r;
        System.out.printf("Area=%.2f\n",area);
        sc.close();

    }
}
