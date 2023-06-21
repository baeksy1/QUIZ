import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int sum = 0;
		int q = 0;
		for(int i =0 ; i<a ; i++) {

			int b = sc.nextInt();
			int c = sc.nextInt();
			q = c*b;
			sum+=q;
		}
		System.out.println(x == sum ?   "Yes" : "No");
	}
}