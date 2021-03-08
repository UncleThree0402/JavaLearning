package ncku.unclethree;

public class IfThenElse {
    public static void main(String[] args){
        int age = 35;
        if(age > 30)
        {
            System.out.println("Age is greater than 30");
        }
        else if(age <= 30 && age >= 18){
            System.out.println("Age is within 30 and 18");
        }
        else{
            System.out.println("Age is less than 18");
        }
    }
}
