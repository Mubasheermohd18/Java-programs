class animal{
    String name;
    int age;
    animal(String n,int a){
        name=n;
        age=a;
        System.out.println("name:"+name+" age:"+age);
    }
       
}
public class paraconst {
    public static void main(String[] args) {
        animal cat = new animal("Rio",4);
        
    }
}
