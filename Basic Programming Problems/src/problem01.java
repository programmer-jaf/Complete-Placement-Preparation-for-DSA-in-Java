import java.util.Scanner;

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
	public static void main(String[] args) {
		System.out.println("Add Digit's problem");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int result= addDigit(num);
		System.out.println("The result is "+result);
		sc.close();
	}
}
