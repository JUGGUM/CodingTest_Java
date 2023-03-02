class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        answer = dot[0] > 0 && dot[1] > 0 ? 1 : dot[1] > 0 ? 2 : dot[0] > 0 ? 4 : 3; 
        return answer;
    }
}