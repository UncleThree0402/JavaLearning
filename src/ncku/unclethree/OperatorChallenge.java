package ncku.unclethree;

public class OperatorChallenge {
    public static void main(String[] args){
        double valueDoubleOne = 20d;
        double valueDoubleTwo = 80d;
        double valueDoubleModulus = ((valueDoubleOne + valueDoubleTwo) * 100d) % 40d;
        System.out.println("Remainder: "+valueDoubleModulus);
        boolean valueZero = (valueDoubleModulus==0)?true:false;
        System.out.println("No remainder ? " + valueZero);

        if(valueZero != true){
            System.out.println("Got some remainder");
        }
    }
}
