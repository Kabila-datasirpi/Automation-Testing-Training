public class Operators {

        public static void main(String[] args) {
            // Variables
            int a = 10, b = 5;
            boolean x = true, y = false;

            // 1. Arithmetic Operators
            System.out.println("Arithmetic Operators:");
            System.out.println("a + b = " + (a + b));  // Addition
            System.out.println("a - b = " + (a - b));  // Subtraction
            System.out.println("a * b = " + (a * b));  // Multiplication
            System.out.println("a / b = " + (a / b));  // Division
            System.out.println("a % b = " + (a % b));  // Modulus

            // 2. Relational Operators
            System.out.println("\nRelational Operators:");
            System.out.println("a == b: " + (a == b)); // Equal to
            System.out.println("a != b: " + (a != b)); // Not equal to
            System.out.println("a > b: " + (a > b));   // Greater than
            System.out.println("a < b: " + (a < b));   // Less than
            System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
            System.out.println("a <= b: " + (a <= b)); // Less than or equal to

            // 3. Logical Operators
            System.out.println("\nLogical Operators:");
            System.out.println("x && y: " + (x && y)); // Logical AND
            System.out.println("x || y: " + (x || y)); // Logical OR
            System.out.println("!x: " + (!x));         // Logical NOT

            // 4. Bitwise Operators
            System.out.println("\nBitwise Operators:");
            System.out.println("a & b: " + (a & b));   // Bitwise AND
            System.out.println("a | b: " + (a | b));   // Bitwise OR
            System.out.println("a ^ b: " + (a ^ b));   // Bitwise XOR
            System.out.println("~a: " + (~a));         // Bitwise NOT
            System.out.println("a << 2: " + (a << 2)); // Left shift
            System.out.println("a >> 2: " + (a >> 2)); // Right shift

            // 5. Assignment Operators
            System.out.println("\nAssignment Operators:");
            int c = a; // Assignment
            System.out.println("c = a: " + c);
            c += b;    // Add and assign
            System.out.println("c += b: " + c);
            c -= b;    // Subtract and assign
            System.out.println("c -= b: " + c);
            c *= b;    // Multiply and assign
            System.out.println("c *= b: " + c);
            c /= b;    // Divide and assign
            System.out.println("c /= b: " + c);
            c %= b;    // Modulus and assign
            System.out.println("c %= b: " + c);

            // 6. Unary Operators
            System.out.println("\nUnary Operators:");
            System.out.println("a++: " + (a++)); // Post-increment
            System.out.println("++a: " + (++a)); // Pre-increment
            System.out.println("b--: " + (b--)); // Post-decrement
            System.out.println("--b: " + (--b)); // Pre-decrement
        }
    }


