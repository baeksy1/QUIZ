import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<ArrayList<Integer>> graph;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        int result = 0;
        //연결 리스트 생성 및 값 넣기
        for (int i = 0; i < m; i++) { // 입력받은 요소들을 해당 인덱스의 리스트에 넣는다
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            graph.get(s).add(e);
            graph.get(e).add(s);
        }
				
				// 가장 작은 노드부터 방문한다고 했으니 정렬
        for(int i = 1; i <=n; i++){
            Collections.sort(graph.get(i));
        }


    check =new boolean[n+1]; // 인덱스 맞춰주기 위해 +1 ( dfs 체크 배열 생성 )

    dfs(start); // dfs 메서드를 호출
    System.out.println(); // 줄 바꿈
    
		check =new boolean[n+1]; // 인덱스 맞춰주기 위해 +1 ( bfs 체크 배열 생성 )
    bfs(start);

}

    static void dfs(int n) {
        if (check[n]) {
            return;
        }
        System.out.print(n + " ");
        check[n] = true;  // 체크 처리
        int size = graph.get(n).size(); // 노드 n의 연결 리스트의 길이
        for (int i = 0; i < size; i++) { // 리스트 길이만큼 수행
            int node = graph.get(n).get(i); // 연결된 노드를 꺼낸다
            if (!check[node]) { // 연결된 노드의 check 가 false 라면
                dfs(node); // dfs 를 재귀 호출
            }
        }
    }

    static void bfs(int n) {
        Queue<Integer> queue = new LinkedList<>();
        check[n] = true; // 체크 처리
        queue.add(n);

        while (!queue.isEmpty()) {
            n = queue.poll();
            System.out.print(n + " ");

            ArrayList<Integer> tmp = graph.get(n);

            for (int i = 0; i < tmp.size(); i++) {
                int node = tmp.get(i);
                if (!check[node]) {
                    check[node] = true;
                    queue.add(node);
                }
            }
        }
    }
}