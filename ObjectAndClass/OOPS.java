public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        p1.setTip(4);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

        Animal a1 = new Animal();
        a1.setName("Dog");
        a1.Speak("bark");
        System.out.println(a1.name);
        System.out.println(a1.speak);
    }
}

class Pen {
    private int tip;
    private String color;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Animal {
    String name;
    String speak;

    void setName(String a) {
        name = a;
    }

    void Speak(String s) {
        speak = s;

    }
}