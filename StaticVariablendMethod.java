public class StaticVariablendMethod {


        // Static variable - shared among all instances
        static int counter = 0;

        // Non-static variable - unique to each instance
        int instanceVar;

        // Constructor to increment the static counter and assign an instance variable
        public StaticVariablendMethod(int value) {
            counter++;  // Increment static variable for every new object
            this.instanceVar = value;  // Assign unique value to the instance variable
        }

        // Static method to display the static variable
        public static void displayStaticCounter() {
            System.out.println("Static Counter (shared among all objects): " + counter);
            // System.out.println(instanceVar); // Error! Can't access non-static variable
        }

        // Non-static method to display the instance variable
        public void displayInstanceVar() {
            System.out.println("Instance Variable (unique to each object): " + instanceVar);
        }

        public static void main(String[] args) {
            // Call static method directly without creating an object
            StaticVariablendMethod.displayStaticCounter();  // Output: Static Counter (shared among all objects): 0

            // Creating objects
            StaticVariablendMethod obj1 = new StaticVariablendMethod(10);
            StaticVariablendMethod obj2 = new StaticVariablendMethod(20);
            StaticVariablendMethod obj3 = new StaticVariablendMethod(30);

            // Call static method after creating objects
            StaticVariablendMethod.displayStaticCounter();  // Output: Static Counter (shared among all objects): 3

            // Call non-static methods (need objects for this)
            obj1.displayInstanceVar();  // Output: Instance Variable (unique to each object): 10
            obj2.displayInstanceVar();  // Output: Instance Variable (unique to each object): 20
            obj3.displayInstanceVar();  // Output: Instance Variable (unique to each object): 30
        }
    }


