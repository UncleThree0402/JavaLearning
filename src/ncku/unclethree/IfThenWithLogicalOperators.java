package ncku.unclethree;

public class IfThenWithLogicalOperators {
    public static void main(String[] args)
    {
        boolean valueBoolean = false;

        if(valueBoolean) {
            System.out.println("True");
        }

        if(!valueBoolean){
            System.out.println("False");
        }

        int valueIntOne = 100;
        int valueIntTwo = 145;

        if(valueIntOne > 100) {
            System.out.println("Greater than 100");
        }

        if(valueIntTwo >= 145){
            System.out.println("Greater than or equal to 145");
        }

        if(valueIntOne == 100 && valueIntTwo > 145) {
            System.out.println("Pass1");
        }

        if(valueIntOne == 100 || valueIntTwo > 145) {
            System.out.println("Pass2");
        }

        int age = 18;
        boolean agePass = (age >= 18)?true:false;
        if(agePass){
            System.out.println("Age greater than or equal to 18");
        }
        else {
            System.out.println("Age less than 18");
        }


    }
}
