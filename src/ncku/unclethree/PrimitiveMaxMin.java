package ncku.unclethree;

public class PrimitiveMaxMin {
    public static void main(String[] args) {
        int maxintvalue = Integer.MAX_VALUE;
        int minintvalue = Integer.MIN_VALUE;
        System.out.println("Max of int : " + maxintvalue); //2147483647
        System.out.println("Min of int : " + minintvalue); //-2147483648
        System.out.println("Overflow Max : " + (maxintvalue + 1)); //-2147483648
        System.out.println("Overflow Min : " + (minintvalue - 1)); //2147483647

        int maxint = 2_147_483_647; //easier to read

        byte maxbytevalue = Byte.MAX_VALUE;
        byte minbytevalue = Byte.MIN_VALUE;
        System.out.println("Max of byte : " + maxbytevalue); //127
        System.out.println("Mix of byte : " + minbytevalue); //-128

        short maxshortvalue = Short.MAX_VALUE;
        short minshortvalue = Short.MIN_VALUE;
        System.out.println("Max of short : " + maxshortvalue); //32767
        System.out.println("Mix of short : " + minshortvalue); //-32768

        long alongvalue = 999L;
        long maxlongvalue = Long.MAX_VALUE;
        long minlongvalue = Long.MIN_VALUE;
        System.out.println("Max of long : " + maxlongvalue); //9223372036854775807
        System.out.println("Mix of long : " + minlongvalue); //-9223372036854775808
    }
}
