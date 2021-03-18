package ncku.unclethree;

public class EvenNumber {
    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static void printEvenNumber(int start, int end) {
        int count = 0;
        if (!(start < end)) {
            System.out.println("Invalid Number");
        } else {
            while (start <= end) {
                if(count == 5){
                    break;
                }
                if (isEvenNumber(start)) {
                    System.out.println("Even Number: " + start);
                    count++;
                }
                start++;

            }
            System.out.println("Found " + count + " even numbers.");
        }
    }
}
