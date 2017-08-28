package ch03.ex08;

public class Ex08 {

    public static void main(String[] args) {

        Greeter greetStar = new Greeter(10, "Hello, Star");
        Greeter greetCrystal = new Greeter(5, "Hello, Crystal");

        new Thread(greetStar).start();
        new Thread(greetCrystal).start();
    }
}
