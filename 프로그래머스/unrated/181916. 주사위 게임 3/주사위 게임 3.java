import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int []arr= {a,b,c,d};
        HashSet<Integer>set=new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        Iterator<Integer> iter = set.iterator();
        if(set.size()==1) {
        	answer=iter.next()*1111;
        }
        else if(set.size()==2) {
        	int a1=iter.next();
        	int b1=iter.next();
        	
        	int co1=0,co2=0;
        	for(int i=0;i<arr.length;i++) {
        		if(arr[i]==a1) {
        			co1++;
        		}else if(arr[i]==b1) {
        			co2++;
        		}
        	}
        	if(co1==3) {
        		answer=(10*a1+b1)*(10*a1+b1);
        	}else if(co2==3) {
        		answer=(10*b1+a1)*(10*b1+a1);
        	}else if(co1==2) {
        		if(a1>b1) {
            		answer=(b1+a1)*-(b1-a1);
            	}else {
            		answer=(b1+a1)*(b1-a1);
            	}
        	}
        }else if(set.size()==3) {
        	int a1=iter.next();
        	int b1=iter.next();
        	int c1=iter.next();
        	int co1=0,co2=0,co3=0;
        	for(int i=0;i<arr.length;i++) {
        		if(arr[i]==a1) {
        			co1++;
        		}else if(arr[i]==b1) {
        			co2++;
        		}else if(arr[i]==c1) {
        			co3++;
        		}
        	}
        	if(co1==2) {
        		answer=b1*c1;
        	}else if(co2==2) {
        		answer=a1*c1;
        	}else if(co3==2) {
        		answer=a1*b1;
        	}
        	
        }else if(set.size()==4) {
       
        	answer=iter.next();
        }
        
        
        return answer;
    }
}