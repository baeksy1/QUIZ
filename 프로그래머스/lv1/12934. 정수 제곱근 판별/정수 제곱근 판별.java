class Solution {
    public long solution(long n) {
        double x = Math.sqrt((double)n);
        if(Math.ceil(x)==x){
            long result=(long)((x+1)*(x+1));
            return result;
        }else{
            return -1;
        }
    }
}