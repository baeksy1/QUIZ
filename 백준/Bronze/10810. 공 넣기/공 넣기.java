import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int [n];
		int m = sc.nextInt();

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=0;
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			for(int j = a-1; j<=b-1; j++) {
				arr[j]=c;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
} 