

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int t= Integer.parseInt(st.nextToken());
		List<String> list =new ArrayList<>();
		for (int i = 0; i < t; i++) {
			
			list.add(br.readLine());
		}
		List<Integer>time=new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			int result=0;
		String [] arr=list.get(i).split(" ");
		int d=Integer.parseInt(arr[1]);
		
		String[]a=arr[0].split(":");
		int h=Integer.parseInt(a[0]);
		int m=Integer.parseInt(a[1]);
		
		while(d>0) {
			if((h>=22||h<3)&&d>300) {
				
				while(h!=8) {
					
					h=(h+1)%24;
					d-=60;
					
				}
				result+=5000;
				d+=m;
				m=0;
			}else {
				h=(h+1)%24;
				d-=60;
				result+=1000;
				
			}
		}
System.out.println(result);
		}

	}
}
