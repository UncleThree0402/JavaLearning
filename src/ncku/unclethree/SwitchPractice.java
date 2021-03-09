package ncku.unclethree;

public class SwitchPractice {
    public static void printLetterSwitch(char valueOne) {
        switch (valueOne) {
            case 'A':
                System.out.println("A was found");
                break;

            case 'B':
                System.out.println("B was found");
                break;

            case 'C':
                System.out.println("C was found");
                break;

            case 'D':
            case 'E':
                System.out.println("D or E was found");
                break;

            default:
                System.out.println("Not found");
        }
    }

    public static void printMonthSwitch(String month) {
        switch (month.toLowerCase()) {
            case "january" -> System.out.println("Jan");
            case "february" -> System.out.println("Feb");
            case "march" -> System.out.println("Mar");
            case "april" -> System.out.println("Apr");
            case "may" -> System.out.println("May");
            case "june" -> System.out.println("Jun");
            case "july" -> System.out.println("Jul");
            case "august" -> System.out.println("Aug");
            case "september" -> System.out.println("Sep");
            case "october" -> System.out.println("Oct");
            case "november" -> System.out.println("Nov");
            case "december" -> System.out.println("Dec");
            default -> System.out.println("Not Found");
        }
    }
}
/*
switch (valueOne) {
    case 'A' -> System.out.println("A was found");
    case 'B' -> System.out.println("B was found");
    case 'C' -> System.out.println("C was found");
    case 'D', 'E' -> System.out.println("D or E was found");
    default -> System.out.println("Not found");
}
*/



