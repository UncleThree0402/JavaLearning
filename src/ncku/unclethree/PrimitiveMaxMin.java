package ncku.unclethree;

public class PrimitiveMaxMin {
    public static void main(String[] args) {
        int maxintvalue = Integer.MAX_VALUE;
        int minintvalue = Integer.MIN_VALUE;
        System.out.println("Max of int : " + maxintvalue); //2147483647
        System.out.println("Min of int : " + minintvalue); //-2147483648
        System.out.println("Overflow Max : " + (maxintvalue + 1)); //-2147483648
        System.out.println("Overflow Min : " + (minintvalue - 1)); //2147483647
    }
}
