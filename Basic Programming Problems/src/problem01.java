import java.util.Scanner;
// ? Leetcode Link --> https://leetcode.com/problems/add-digits/description/
public class problem01 {
// ✅ brute-force solution
	static int addDigit(int num){
		while (num>=10){
			int ans=0;
			while (num>0){
				ans+=num%10;
				num/=10;
			}
			num=ans;
		}
		return num;
	}
	// ✅ Optimized Solution
	static int addDigitOptimized(int num){
		if (num==0) return 0;
		return (num%9==0) ? 9 :(num%9);
	}
	public static void main(String[] args) {
		System.out.println("Add Digit's problem");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int result= addDigit(num);
		int optimizedResult= addDigitOptimized(num);
		System.out.println("The result is "+result);
		System.out.println("The optimized result is "+optimizedResult);
		sc.close();
	}
}
