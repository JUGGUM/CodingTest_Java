class Solution {
    public int solution(int hp) {
        int ant1 = 5;
        int ant2 = 3;
        int ant3 = 1;
        int answer = 0;
        int ant2count = 0;
        int ant3count = 0;
        
        if(hp >= ant1){
            answer = hp/ant1;//4
            hp = hp - (ant1*answer); //23 - (20)
        }
        if(hp >= ant2){
            ant2count = hp/ant2;
            answer = answer + ant2count;
            hp = hp - (ant2*ant2count);
        }
        if(hp >= ant3){
            ant3count = hp/ant3;
            answer = answer + ant3count;
            hp = hp - (ant3*ant3count);
        }
        
        
        return answer;
    }
    
}