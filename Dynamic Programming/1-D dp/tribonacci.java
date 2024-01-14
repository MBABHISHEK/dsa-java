class Solution {
    public int tribonacci(int n) {
        if(n==1 || n==2){
            return 1;
        }
        if(n==0){
            return 0;
        }
        int one = 0  , two = 1 , three = 1 , val = 0;
        for(int i = 3 ; i <= n ; i++){
            val = one + two + three;
            one = two;
            two = three;
            three = val;
        }
        return val;
    }
}
