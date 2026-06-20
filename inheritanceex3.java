class smng_base{
    int ram=8;
    int batt=5000;
    void play(){
        System.out.println("Playing music...");
    }
}

class smng_pro extends smng_base{
    int cam=50;
    int ram=12;
}

class smng_ultra extends smng_base{
    void display(){
        System.out.println("Curved Amoled display");
    }
}
public class inheritanceex3 {
    public static void main(String[] args) {
        smng_ultra sp = new smng_ultra();
        System.out.println(sp.ram);
        System.out.println(sp.batt);
        System.out.println();
        sp.display();
        sp.play();
    }
}
