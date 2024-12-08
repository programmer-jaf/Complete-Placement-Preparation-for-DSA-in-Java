import java.util.Scanner;
// ? Leetcode Link https://leetcode.com/problems/reverse-integer/description/
public class problem03 {
	static int reverseInteger(int num){
		int ans=0;
		while(num!=0){
			int remainder =num%10;
			if (ans>Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 && remainder >7)) return 0;
			else if (ans<Integer.MIN_VALUE/10 || (ans==Integer.MIN_VALUE/10 && remainder < -8)) return 0;
			ans=ans*10+remainder;
			num/=10;
		}
		return ans;
	}
	public static void main(String[] args) {
		System.out.println("solve reverse an integer");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		int result= reverseInteger(num);
		System.out.println("The reverse integer is "+result);
	}
}
