package ncku.unclethree;

public class Sum3And5Challenge {
    public static void main(String[] args) {
        int result = 0, count = 0;

        for (int i = 1; i <= 1000; ++i) {
            if (count >= 5) {
                System.out.println("Sum: " + result);
                break;
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number: " + i);
                result += i;
                count++;
            }
        }
    }
}
