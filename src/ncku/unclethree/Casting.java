package ncku.unclethree;

public class Casting {
    public static void main(String[] args)
    {
        byte valuebyte = 120;

        int valueint = (int) (valuebyte / 2); //convert to int
        short valueshort = (short) (valueint / 2); //convert to short
        double valuedouble = (double) (valueshort / 2 + 0.25); //convert to double

        System.out.println(valueint); //60
        System.out.println(valueshort); //30
        System.out.println(valuedouble); //15.25

    }
}
