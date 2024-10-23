public class AccessModifier {
    // Public variable accessible from any class
    public String publicVar = "I am public";

    // Protected variable accessible within the package and by subclasses
    protected String protectedVar = "I am protected";

    // Default variable accessible only within the same package
    String defaultVar = "I am default (package-private)";

    // Private variable accessible only within this class
    private String privateVar = "I am private";

    // Public method
    public void publicMethod() {
        System.out.println("Public Method: " + publicVar);
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("Protected Method: " + protectedVar);
    }

    // Default (package-private) method
    void defaultMethod() {
        System.out.println("Default Method: " + defaultVar);
    }

    // Private method
    private void privateMethod() {
        System.out.println("Private Method: " + privateVar);
    }

    // Method to demonstrate access within the same class
    public void demonstrateAccess() {
        System.out.println("Inside same class:");

        // Accessing all members from within the same class
        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();  // Private method can be accessed here
    }

    public static void main(String[] args) {
        AccessModifier example = new AccessModifier();

        // Accessing members from outside the class
        System.out.println("\nAccess from outside the class:");
        example.publicMethod();   // Accessible
        example.protectedMethod(); // Accessible within the same package
        example.defaultMethod();  // Accessible within the same package

        // example.privateMethod(); // Error! Cannot access private method

        // Demonstrating access within the same class
        example.demonstrateAccess();
    }
}

// Another class in the same package
class AnotherClass {

    public static void main(String[] args) {
        AccessModifier example = new AccessModifier();

        System.out.println("\nAccess from another class in the same package:");
        example.publicMethod();   // Accessible
        example.protectedMethod(); // Accessible (same package)
        example.defaultMethod();  // Accessible (same package)

        // example.privateMethod(); // Error! Cannot access private method
    }
}

// A subclass in the same package
class SubClass extends AccessModifier {

    public void accessFromSubclass() {
        System.out.println("\nAccess from subclass:");
        publicMethod();   // Accessible
        protectedMethod(); // Accessible
        defaultMethod();  // Accessible (same package)

        // privateMethod(); // Error! Cannot access private method
    }
}


