import java.util.Scanner;
class Student {
    String name;
    int age;
}
public class ClassFundamental {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s = new Student(); 
        System.out.print("Enter name: "); s.name = sc.next();
        System.out.print("Enter age: "); s.age = sc.nextInt();
        System.out.println("Student Name: " + s.name + ", Age: " + s.age);
        sc.close();
    }
}
