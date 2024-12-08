import java.util.Scanner;
// ? Leetcode Link --> https://www.geeksforgeeks.org/problems/leap-year0943/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
// ? GfG link --> https://www.geeksforgeeks.org/problems/reverse-digit0316/1
public class problem02 {
	static boolean leapYear(int year){
		boolean result=false;
		if (year%400==0) result=true;
		else if (year%4==0 && year%100!=0) result =true;
		return result;
	}
	public static void main(String[] args) {
		System.out.println("solve LeapYear problem");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = sc.nextInt();
		boolean result = leapYear(year);
		System.out.println("The year "+year+" is a leap year is it "+result);
		sc.close();
	}
}
