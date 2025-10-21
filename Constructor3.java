import java.util.Scanner;

class Student {
    String name;
    int marks;

    Student(String n, int m) {
        name = n;
        if (m >= 0 && m <= 100) {
            marks = m;
        } else {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
    }

    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}

public class Constructor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        Student s = new Student(name, marks);
        s.display();
        sc.close();
    }
}
