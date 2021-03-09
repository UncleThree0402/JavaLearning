package ncku.unclethree;

public class MethodOverloading {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        } else {
            return feet * 30.48 + inches * 2.54;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        } else {
            return calcFeetAndInchesToCentimeters((int) (inches / 12), inches % 12);
        }
    }
}
