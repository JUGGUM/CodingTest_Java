class Solution {
    public String solution(String s) {
        String answer = "";
        String[] stringNumbers = s.split(" ");
        int temp;
        
        int[] numbers = new int [stringNumbers.length];
        for(int i = 0; i<stringNumbers.length; i++){
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }
        for(int i = 0; i<numbers.length; i++){
            for(int j = 1; j<numbers.length; j++){
                if(numbers[j-1] > numbers[j]){
                    temp = numbers[j-1];
                    numbers[j-1] =numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        String bigNumber = Integer.toString(numbers[numbers.length-1]) ;
        String smallNumber = Integer.toString(numbers[0]) ;
        
        answer = smallNumber + " " + bigNumber;
        
        return answer;
    }
}