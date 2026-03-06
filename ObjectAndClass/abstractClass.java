public class abstractClass {
    public static void main(String[] args) {
        Mustang m = new Mustang();
        Horse h = new Horse();
        Duck d = new Duck();

        h.eat();
        h.walk();
        System.out.println(h.color);

        d.eat();
        d.walk();

    }
}

abstract class Animal{
    String color;
    Animal(){
        color= "Brown";
        System.out.println("Animal constructor is called");
    }
    void eat(){
        System.out.println("Anmial eats");
    }

    abstract void walk();
}

class Horse extends Animal {

    Horse(){
        System.out.println("Horse constructor is called");
    }
    void changeColor(){
        color= "Dark Brown";
    }
    void walk(){
         System.out.println("Horse walk on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang(){
        System.out.println("Horse construtor is called");
    }
}

class Duck extends Animal {
    void changeColor(){
        color= "White";
    }
     void walk(){
        System.out.println("Duck walks on 2 legs");
     }
}