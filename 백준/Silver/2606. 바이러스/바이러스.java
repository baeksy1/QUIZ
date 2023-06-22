import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static ArrayList<Integer>A[];
	static boolean visited[];
	public static void main(String[] args) throws IOException{
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int m=Integer.parseInt(br.readLine());
		A=new ArrayList[n+1];
		visited=new boolean[n+1];
		
		for (int i = 0; i < n+1; i++) {
			A[i]=new ArrayList<Integer>();
		}
		
		StringTokenizer st;;
		for (int i = 0; i <m; i++) {
			st = new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken());
			int e =Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s);
		}
		
		for(int i=0; i<n; i++) {
			Collections.sort(A[i]);
		}
		
		
		DFS(1);
		int count=-1;
		
		for (int i = 0; i < visited.length; i++) {
			if(visited[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	
	
	private static void DFS(int Node) {
		visited[Node]=true;//방문한 노드를 t로 바꿔서 다시 안가게 정리.
		for(int i:A[Node]) {//갈수 있는 노드 찾기
			if(!visited[i]){//이미 방문하지 않는 노드만 방문해라는 명령어.
				DFS(i);
			}
		}
	}
}