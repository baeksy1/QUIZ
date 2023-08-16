import java.util.*;
 
class Solution {
    public int solution(String numbers) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        List<String> allNums = new ArrayList<>(
                Arrays.asList(numbers.split(""))
        );
 
        for(int i = 0 ; i < allNums.size() ; i++) {
            Collections.sort(allNums);
            String current = allNums.remove(i);
            permutation(set, allNums, current);
            allNums.add(current);
 
        }
 
        for(Integer i : set) {
            if(isPrimeNumber(i)) answer++;
        }
 
       return answer;
    }
    
    public static void permutation(Set<Integer> set, List<String> all, String current) {
 
        // 다음 거 추가하지 않는 경우
        set.add(Integer.parseInt(current));
 
        if(all.size() == 0) return;
 
        // 다음 거 추가 하는 경우
        for(int i = 0 ; i < all.size() ; i++) {
            String next = all.remove(0);
            permutation(set, all, current + next);
            all.add(next);
        }
    }
 
    public static boolean isPrimeNumber(int number) {
        int sqrt = (int) Math.sqrt(number);
 
        if(number <= 1) return false;
        for(int i = 2 ; i <= sqrt ; i++) {
            if(number % i == 0) return false;
        }
 
        return true;
    }
}