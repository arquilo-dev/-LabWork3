
public class OPDrills {
    public static void main(String[] args) {

        // Task 1: The Empty Blueprint
        VoidContainer container = new VoidContainer();
        System.out.println("Task 1: Object created successfully");

        // Task 2: Naming Violations
        // class public {} // Error: keyword cannot be used
        // class true {}   // Error: boolean literal cannot be used

        // Task 3: The Case of the String
        StringExample example = new StringExample();
        System.out.println("Task 3: " + example.text);

        // Task 4: Local vs. Field
        LocalExample local = new LocalExample();
        local.showX();

        // Task 5: The Static Shared Secret
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c1.count++;
        c2.count++;
        c3.count++;
        System.out.println("Task 5: " + c1.count);

        // Task 6: Final Lockdown
        FinalExample finalExample = new FinalExample();
        finalExample.showPI();

        // Task 7: The Null Trap
        // Student s;
        // System.out.println(s.name);
        // Error: variable s might not have been initialized

        // Task 8: Default Primitives
        Defaults defaults = new Defaults();
        defaults.showDefaults();

        // Task 9: Method Math
        MathExample math = new MathExample();
        System.out.println("Task 9: " + math.square(5));

        // Task 10: The Multi-Line String
        User user = new User();
        user.printBusinessCard();
    }
}

// Task 1
class VoidContainer {
}

// Task 3
class StringExample {
    String text;
}

// Task 4
class LocalExample {
    int x = 10;

    void showX() {
        int x = 20;
        System.out.println("Task 4: " + x);
    }
}

// Task 5
class Counter {
    static int count = 0;
}

// Task 6
class FinalExample {
    final double PI = 3.14;

    void showPI() {
        // PI = 3.15;
        // Error: cannot assign a value to final variable PI
        System.out.println("Task 6: " + PI);
    }
}

// Task 7
class Student {
    String name;
}

// Task 8
class Defaults {
    int number;
    boolean active;
    double value;

    void showDefaults() {
        System.out.println("Task 8:");
        System.out.println(number);
        System.out.println(active);
        System.out.println(value);
    }
}

// Task 9
class MathExample {
    int square(int n) {
        return n * n;
    }
}

// Task 10
class User {
    void printBusinessCard() {
        System.out.println("Task 10:");
        System.out.println("Business Card\n\tName: Alex\n\tJob: Developer");
    }
}

// Task 2: Naming Violations
// class public {} // Error: 'public' is a reserved keyword
// class true {} // Error: 'true' is a boolean literal