import java.util.Scanner;
class Person {
    String name; int age;
    Person(String name, int age) { this.name=name; this.age=age; }
}
class Teacher extends Person {
    String subject; double salary;
    Teacher(String name, int age, String subject, double salary){
        super(name, age); this.subject=subject; this.salary=salary;
    }
    void display(){
        System.out.println("Name: "+name+", Age: "+age+", Subject: "+subject+", Salary: "+salary);
    }
}
public class Inheritance1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name, age, subject, salary: ");
        String n=sc.next(); int a=sc.nextInt(); String s=sc.next(); double sal=sc.nextDouble();
        Teacher t = new Teacher(n,a,s,sal);
        t.display();
        sc.close();
    }
}
