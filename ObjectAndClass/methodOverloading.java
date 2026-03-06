public class methodOverloading {
    public static void main(String args[]){

        // Calculator c1 =new Calculator();
        // System.out.println(c1.sum(2, 3));
        // System.out.println(c1.sum(2, 3.3f));
        // System.out.println(c1.sum(2, 3, 2));
        Dog a1= new Dog();
        a1.eat();
    }
    
}

// Function overriding 

class Animal{
    void eat(){
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating..");
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}