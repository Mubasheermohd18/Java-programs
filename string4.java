import java.util.*;
public class string4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        name=name.toLowerCase();
        int co=0;

        for(int i=0;i<name.length();i++){
            char c= name.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                co++;
            
        }
        System.out.println(co);
    }
}
