package pl.mkluzniak;

public class Main {

    public static void main(String[] args) {
        // method = block of code that is executed whenever it is called upon

        String name = "Bro"; //set name as String and naming it
        int age =21; //set age

        hello(name,age); //declaration called upon method hello

    }

    static void hello(String title, int age) { // new method called hello
        System.out.println("Hello " + title); // printing in console name that is declared in previous method
        System.out.println("You are " + age); // printing in console age that is declared in previous method
    }

}
