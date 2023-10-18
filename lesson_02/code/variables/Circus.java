package variables;

public class Circus {
    public static void main(String[] args) {
        lightOn();
        entertainer();
        lightOff();
    }
    public static void lightOn(){
        System.out.println("LIGHTS ON!");
    }
    public static void entertainer(){
        jogger();
        singer();
        cloun();
    }
    public static void lightOff(){
        System.out.println("LIGHTS OFF!");
    }
public static void jogger(){
    System.out.println("My name Jon");
    System.out.println("Im jogging");
    }
    public static void singer(){
        System.out.println("My name Phillp");
        System.out.println("Im singing");
    }
    public static void cloun(){
        System.out.println("My name Oleg Popov");
        System.out.println("Im joking");

    }
}