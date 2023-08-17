import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	
	static int n;
	static int m;
	static int[] arr;
	static int[] result;
	static boolean []visit;
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) throws IOException {
		
		
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n=Integer.parseInt(st.nextToken());	
		m=Integer.parseInt(st.nextToken());	
		arr=new int[n];
		result=new int[n];
		visit=new boolean[n];
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		
		Arrays.sort(arr);
		dfs(0);
		System.out.println(sb);
	}

	private static void dfs(int a) {

		if(a==m) {//m까지 돌아야됨
			for(int i=0;i<m;i++) {
				sb.append(result[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		int prev=-1;
		for(int i=0; i<arr.length;i++) {
			int now=arr[i];
			if(visit[i]||prev==now) {
				continue;
			}else {
				prev=now;
				visit[i]=true;
				result[a]=arr[i];
				dfs(a+1);
				visit[i]=false;
			}
			
		}
		
	}
	
	
}
