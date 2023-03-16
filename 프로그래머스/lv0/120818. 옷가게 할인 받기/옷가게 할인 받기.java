class Solution {
    public int solution(int price) {
        int answer = 0;
        double salePrice = 0;
        if(price>=10 && price<=1000000){
            salePrice = price >= 500000 ? price*0.8 : price >= 300000 ? price*0.9 : price >=100000 ? price*0.95 : price;
        salePrice = Math.floor(salePrice);
        }else{
            salePrice = price;
        }
        answer = (int)salePrice;
        return answer;
    }
}