import java.util.*;

public class conditionalStatements {
    public static void main(String []args){

    
    Scanner sc = new Scanner(System.in);
    //int a=sc.nextInt();
    //if block

    /*i
    if(a==0){
        System.out.println("Hi");
        //this print only if condition is true
    }
    System.out.println("bye");
    }*/

    //if else block

    /*if(a>0){
        System.out.println("greater than 0");
    }
    else{
        System.out.println("Less than 0");
    }
    }*/

    int a=sc.nextInt();
    int b=sc.nextInt();

    if(a>b){
        System.out.println("a is greater");
    }
    else{
        System.out.println("b is greater");
    }

    sc.close();

}
}
