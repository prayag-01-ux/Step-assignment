// ...existing code...
// ...existing code...
package level1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < ages.length; ) {
            try {
                int val = sc.nextInt();
                if (val < 0) {
                    System.out.println("Invalid age, enter a non-negative integer:");
                    continue;
                }
                ages[i++] = val;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer:");
                sc.next(); // consume invalid token
            }
        }
        sc.close();

        for (int age : ages) {
            if (age >= 18) {
                System.out.println("The student with age " + age + " can vote.");
            } else {
                System.out.println("The student with age " + age + " cannot vote.");
            }
        }
    }
}
// ...existing code...

