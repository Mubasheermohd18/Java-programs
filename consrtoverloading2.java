
class Animal{
    String name;
    int legs;
    Animal(String name, int legs){
        this.name=name;
        this.legs=legs;
        this(5);
    }
    Animal(int n){
        System.out.println("C");
    }
    void display(){
        System.out.println("display method");
    }
    void show(){
        System.out.println(this.name+" "+this.legs);
        this.display();
    }

}
public class consrtoverloading2 {
    public static void main(String[] args){
        Animal cat=new Animal();
        Animal dog=new Animal("hey");
        Animal tiger=new Animal("hey",3);

    }
    
}
