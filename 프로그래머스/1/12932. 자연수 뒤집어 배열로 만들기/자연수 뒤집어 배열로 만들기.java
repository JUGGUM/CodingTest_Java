class Solution {
    public int[] solution(long n) {
        String nString = String.valueOf(n);
                int[] answer = new int[nString.length()];
        StringBuilder sb = new StringBuilder(nString);
        sb.reverse();
        for(int i = 0 ; i<=sb.length()-1; i++ ){
            answer[i] = Integer.parseInt(String.valueOf(sb.charAt(i)));
        }
        return answer;
    }
}