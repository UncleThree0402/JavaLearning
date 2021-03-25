package ncku.unclethree;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, input;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Number:");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                input = scanner.nextInt();
                if (input > max) {
                    max = input;
                }
                if (input < min) {
                    min = input;
                }
            } else {
                System.out.println("Invalid Number");
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Minimum is " + min + " , and Maximum is " + max);
    }

}
