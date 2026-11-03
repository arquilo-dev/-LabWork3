
public class ScopeDetective {

    // Task 1: Instance variable
    int instanceNumber = 100;

    // Task 2: Method with parameter
    public void investigate(int parameterNumber) {

        System.out.println("Inside investigate method:");
        System.out.println("Instance variable: " + instanceNumber);
        System.out.println("Parameter: " + parameterNumber);

        // Task 3: For loop
        for (int i = 0; i < 3; i++) {
            System.out.println("Inside loop:");
            System.out.println("i = " + i);
            System.out.println("Instance = " + instanceNumber);
            System.out.println("Parameter = " + parameterNumber);
        }

        // Task 4: Outside the loop
        System.out.println("Outside loop:");
        System.out.println("Instance = " + instanceNumber);
        System.out.println("Parameter = " + parameterNumber);

        // System.out.println(i);
        // Error: Cannot resolve symbol 'i'
        // Variable i exists only inside the for loop.
    }

    // Task 5: Different method
    public void anotherMethod() {

        System.out.println("Inside anotherMethod:");
        System.out.println("Instance = " + instanceNumber);

        // System.out.println(parameterNumber);
        // Error: Cannot resolve symbol 'parameterNumber'
        // Parameter belongs only to investigate method.
    }

    // Main method
    public static void main(String[] args) {

        ScopeDetective detective = new ScopeDetective();

        detective.investigate(50);
        detective.anotherMethod();
    }
}
