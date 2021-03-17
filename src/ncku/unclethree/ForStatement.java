package ncku.unclethree;

public class ForStatement {
    public static void calculateInterest(double money, double startInterest, double totalYear){
        for (double i = 0; i < totalYear ; ++i){
            money*=(1+(startInterest/100));
        }
        System.out.printf("%.2f",money);
    }

    public static void countPrime(int start, int end){
        int count = 0;
        for(int i = start;i<= end; i++){
            if(isPrime(i)){
                ++count;
                System.out.println(i + " is a prime number.");
            }
            if (count >= 3){
                System.out.println("You have 3 prime number till "+i);
                break;
            }
        }
    }

    private static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i = 2; i <= (long) Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
