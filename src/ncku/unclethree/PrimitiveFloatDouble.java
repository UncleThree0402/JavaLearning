package ncku.unclethree;

public class PrimitiveFloatDouble {
    public static void main(String[] args)
    {
        float maxfloatvalue = Float.MAX_VALUE;
        float minfloatvalue = Float.MIN_VALUE;
        System.out.println("Max of float : " + maxfloatvalue); 
        System.out.println("Min of float : " + minfloatvalue);

        double maxdoublevalue = Double.MAX_VALUE;
        double mindoublevalue = Double.MIN_VALUE;
        System.out.println("Max of double : " + maxdoublevalue);
        System.out.println("Min of double : " + mindoublevalue);

        int valueint = 5 / 3;
        float valuefloat = 5f / 3f; //Java will init floating point number be double. (Casting also work)
        double valuedouble = 5d / 3d;

        System.out.println("Int : " + valueint);
        System.out.println("Float : " + valuefloat);
        System.out.println("Double : " + valuedouble);

    }
}
