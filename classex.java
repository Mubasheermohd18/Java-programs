class Animal{
    String name;
    int legs;

    void show(){
        System.out.println("name:"+name+" Legs:"+legs);
    }
}
public class classex {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name="Rio";
        cat.legs=4;
        cat.show();

        Animal dog= new Animal();
        dog.name="Shiro";
        dog.legs=4;
        dog.show();
    }
}
