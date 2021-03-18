package ncku.unclethree;

public class DigitSumChallenge {
    public static int sumDigits(int number) {
        float buffer = number;
        int sum = 0;
        if (number < 10) {
            return -1;
        } else {
            while (number > 0) {
                sum += (((buffer / 10) - (number / 10))) * 10;
                buffer /= 10;
                number /= 10;
            }
            return sum;
        }
    }
}
