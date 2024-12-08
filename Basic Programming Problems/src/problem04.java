import java.util.Scanner;
//? Leetcode Link --> https://leetcode.com/problems/palindrome-number/description/
public class problem04 {
	static boolean palindromeNumber(int number){
		if (number<0) {
			return false;
		}
		int ans=0;
		int num = number;
		while (number!=0) {
			ans = ans * 10 + (number%10);
			number/=10;
		}
		if (ans==num) return true;
		else return false;
	}
	public static void main(String[] args) {
		System.out.println("solve palindrome number");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		boolean result = palindromeNumber(num);
		System.out.println("The number is a palindrome "+result);
		sc.close();
	}
}
