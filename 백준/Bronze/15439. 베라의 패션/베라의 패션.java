import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <=a; i++) {
			
			for (int j = 1; j <=a; j++) {
				if(i==j) {
				continue;
				}
				sum++;
			}
		}
		System.out.println(sum);
	}
	
}
