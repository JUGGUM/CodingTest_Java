class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] myArray = my_string.split("");
        StringBuilder result = new StringBuilder();
         for(String s : myArray) {
            System.out.println("s======"+ s);
            if (Character.isUpperCase(s.charAt(0))) {
                result.append(s.toLowerCase());
            }else{
                result.append(s.toUpperCase());
            }
        }
        answer = result.toString();
        
        return answer;
    }
}