class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int answerSum = 0;
        int answerAlla = 1 ;
        for(int i = 0; i< num_list.length; i++){
            answerSum += num_list[i];
        }
         for(int i = 0; i< num_list.length; i++){
            answerAlla *= num_list[i];
        }
        answer = answerSum*answerSum > answerAlla ? 1 : 0;
        return answer;
    }
}