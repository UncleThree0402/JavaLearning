package ncku.unclethree;

public class AboutString {
    public static void main(String[] args)
    {
        String myString = "A String";
        myString += " Other String ";
        System.out.println(myString); //A String Other String
        System.out.println(myString + 1000); //A String Other String 1000
    }
}

/*
String is immutable
Every change is to creat a new String
 */
