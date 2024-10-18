public class loopsndConditions {
    public static void main(String[] args) {
        int number = 10;

        // If-else and else-if demo
        if (number < 10) {
            System.out.println("Number is less than 10");
        } else if (number == 10) {
            System.out.println("Number is equal to 10");
        } else {
            System.out.println("Number is greater than 10");
        }

        // For loop with break and continue
        System.out.println("For loop demo:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Skipping number 5 (using continue)");
                continue; // Skip the rest of the loop for i = 5
            }
            if (i == 8) {
                System.out.println("Breaking loop at number 8");
                break; // Exit the loop when i = 8
            }
            System.out.println("i = " + i);
        }

        // While loop
        System.out.println("\nWhile loop demo:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        // Do-while loop
        System.out.println("\nDo-while loop demo:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 3);
    }
}
