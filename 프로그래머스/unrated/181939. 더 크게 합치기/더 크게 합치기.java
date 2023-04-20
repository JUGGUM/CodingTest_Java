class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String answer2;
        String answer3;
        int answer4;
        int answer5;
        answer2 = Integer.toString(a) + Integer.toString(b);
        answer3 = Integer.toString(b) + Integer.toString(a);
        answer4 = Integer.parseInt(answer3);
        answer5 = Integer.parseInt(answer2);
        answer = answer4 > answer5 ? answer4 : answer5;
        return answer;
    }
}