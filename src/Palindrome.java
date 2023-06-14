import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
		System.out.println("Enter a word to determine if its a palindrome or not:\n");
    	Scanner input = new Scanner(System.in);

        String a = input.nextLine();
		String r = "";
		for(int i = a.length() - 1; i >= 0; i--) {
			r += a.charAt(i);
		}
		
		boolean palindrome = true;
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) != r.charAt(i)) {
				palindrome = false;
			}
		}
		
		if(palindrome) {
			System.out.println(a+" is a palindrome!");
		} else {
			System.out.println(a+ " is not a palindrome!");
		}
		
	}
}
