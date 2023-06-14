
public class sumof100primenumbers{
	
	public static void main(String args[]) {
        long sum = 0;
        for (int number = 2; number <= 100; number++) {
            if (isPrimeNumber(number)) {
                sum += number;
            }
        }

        System.out.println("The sum of first 100 numbers is "+sum);
    }

    private static boolean isPrimeNumber(int number){
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
