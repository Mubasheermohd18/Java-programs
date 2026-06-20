
class Animal{
    String name;
    int legs;
    Animal(){
        System.out.println("C1");
    }
    Animal(String n){
        System.out.println("C2");
    }
    Animal(String n, int l){
        System.out.println("C3");
    }
}
public class consrtoverloading {
    public static void main(String[] args){
        Animal cat=new Animal();
        //Animal dog=new Animal("hey");
        Animal tiger=new Animal("hey",3);

    }
    
}
