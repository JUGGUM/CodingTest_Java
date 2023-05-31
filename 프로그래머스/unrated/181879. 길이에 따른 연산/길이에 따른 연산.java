class Solution {
    public int solution(int[] num_list) {
        int answer = num_list[0];
        System.out.println(num_list.length);
        if(num_list.length >= 11){
            for(int i = 1; i< num_list.length; i++){
                answer += num_list[i];
              }
        }else{
            for(int i = 1; i<num_list.length; i++){
                answer *= num_list[i];
            }
        }
        return answer;
    }
}