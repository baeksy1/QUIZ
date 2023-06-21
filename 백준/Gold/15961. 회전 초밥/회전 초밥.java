import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main  {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());//8
		int D = Integer.parseInt(st.nextToken());//30
		int K = Integer.parseInt(st.nextToken());//4
		int C = Integer.parseInt(st.nextToken());//30
		int[] arr = new int[N+K-1];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int i = N; i < N+K-1; i++) {
			arr[i] = arr[i-N];
		}//회전하는 배열이지만 앞에 3개까지만 확인하면 나머진 똑같기 때문에 
		//[7, 9, 7, 30, 2, 7, 9, 25, 7, 9, 7] 앞에 세개를 복사해서 뒤에 붙인다
		int[] count = new int[D+1]; //초밥의 가지수를 나타낼 배열 arr[C]를 나타내야 되기 때문에 +1해줌
		int[] res = new int[N];
		for (int i = 0; i < K; i++) {
			count[arr[i]]++;
		}//초밥의 가지수 안에 arr[i]번이 있다면 +를 해줌
		for (int i = 0; i <= D; i++) {//+1을 했기 때문에 <=를 한다
			if(count[i] > 0) res[0]++;
//			System.out.println(Arrays.toString(count));
//			[0, 0, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]
			//즉 res[0]=3;
		}//start가 0일때를 먼저 세서 카운트할 배열에 초기화를 시켜준다. 
		boolean coupon = false;
		if(count[C] == 0) {
			res[0]++;
			coupon = true;
			//start가 0일때 쿠폰의 번호가 없으면 쿠폰을 true로 바꿔줌
		}
		int max = res[0];//최대경우의 수를 초기화시켜줌
//		System.out.println(Arrays.toString(res));
		for (int i = 1; i < N; i++) {

			res[i] = res[i-1];
			//하나 증가할떄마다 결과 한칸씩 이동
//			System.out.println(Arrays.toString(res));
//			[3, 3, 0, 0, 0, 0, 0, 0]
//			[3, 4, 4, 0, 0, 0, 0, 0]
//			[3, 4, 3, 3, 0, 0, 0, 0]
//			[3, 4, 3, 4, 4, 0, 0, 0]
//			[3, 4, 3, 4, 5, 5, 0, 0]
//			[3, 4, 3, 4, 5, 4, 4, 0]
//			[3, 4, 3, 4, 5, 4, 4, 4]

			//슬라이딩 윈도우를 사용하여 처음값은 빼주고 다음 마지막 값을 더해준다 
			count[arr[i-1]]--; 
			//i가 1일때 arr[i-1]=0번째인 7이다. 따라서 count[7]번째를 -1
			count[arr[i+K-1]]++;
			//i가 1일때 arr[i+k-1]=4번째인 2이다. 따라서 count[2]번째를 +1
			
			
			
			//왼쪽 수와 오른쪽 수의 경우의 수 구하기
			
			if(arr[i-1] != arr[i+K-1]) { 
				//중간에 있는 값들은 이미 비교를 했으므로 처음값과 마지막 값만 확인하면 됨
				if(count[arr[i-1]] == 0) res[i]--;
				
				//1이상이라는 소리는 왼쪽수 제외하고 배열안에 하나가 더 있다는 뜻!
				//ex) i가 1일때  7,9,7,30 --> 이건 7이 두개이기 때문에 count[arr[i-1]]==1이다! -왜 1이냐면 위에서 1빼줬기 때문
				//만약 0보다 큰 경우 연속해서 먹는 접시 수 안에 2가지 이상이였다는 뜻이므로 -를 안해도 됨
				if(count[arr[i+K-1]] == 1) res[i]++;//
				//새로들어온 초밥이 먹지 않은 수이기 때문에 +1
				//2이상이면 이미 count배열안에 같은 초밥이 있다는 뜻이므로 증가 x
			}
			
			
			//쿠폰이 있는지 없는지
			if(!coupon && count[C] == 0) { //쿠폰이 없는 경우
				coupon = true;
				res[i]++;
				//쿠폰을 true로 바꾸고 카운트 하나 증가
			} else if(coupon && count[C] != 0) {//쿠폰이 있는경우
				coupon = false;
				res[i]--;
			}
			max = Math.max(max, res[i]);
		}
		System.out.println(max);
	}
}
