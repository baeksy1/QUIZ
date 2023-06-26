import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Solution {
   public String solution(String new_id) {
		String answer = "";
		new_id=new_id.toLowerCase();
		String[]arr=new_id.split("");
		for (int i = 0; i < arr.length; i++) {
			String pattern2="[a-z0-9-_.]+";
			Pattern p = Pattern.compile(pattern2);
			Matcher m = p.matcher(arr[i]);
			while(m.find()) {
				answer+=m.group();
			}
		}
		
		answer=answer.replaceAll("[.]{2,}", ".");
		
		if(answer.charAt(0)=='.') {
			answer=answer.substring(1);
		}
		
		if(answer.length()>0&& answer.charAt(answer.length()-1)=='.') {
			answer=answer.substring(0,answer.length()-1);
		}
		
		if(answer.equals("")) {//5단계
			answer="a";
		}
		
		
		if(answer.length()>=16) {
			answer=answer.substring(0,15);
			if(answer.charAt(answer.length()-1)=='.') {
				answer=answer.substring(0,answer.length()-1);
			}
		}

		if(answer.length()<=2) {
			
			while(answer.length()<3) {
				answer+=answer.charAt(answer.length()-1);
			}
		}




		return answer;
	}
}