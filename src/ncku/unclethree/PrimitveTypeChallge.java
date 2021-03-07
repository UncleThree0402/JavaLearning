package ncku.unclethree;

public class PrimitveTypeChallge {
    public static void main(String[] args){
        byte valuebyte = 120;
        short valueshort = 1000;
        int valueint = 3690;
        long valuelong = 50000L + 10L * (valuebyte + valueshort + valueint);
        System.out.println(valuelong);
    }
}
