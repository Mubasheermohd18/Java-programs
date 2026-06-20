class smng_base{
    int ram=8;
    int batt=5000;
    void play(){
        System.out.println("Playing music...");
    }
}

class smng_pro extends smng_base{
    int cam=50;

}
public class inheritanceex {
    public static void main(String[] args) {
        smng_pro sp = new smng_pro();
        System.out.println(sp.ram);
        System.out.println(sp.batt);
        System.out.println(sp.cam);
        sp.play();
    }
}
