package ncku.unclethree;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        int count = 0, result =0;
        Scanner scanner = new Scanner(System.in);
        while(count < 10){
            System.out.println("Enter number #" + (count+1)  +": ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                result += scanner.nextInt();
                count++;
            }
            else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println(result);
    }

}
