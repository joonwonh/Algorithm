class Solution {
    public double solution(int[] numbers) {
        double result = 0;
        int avg = 0;  
        for(int i = 0; i<numbers.length; i++) {   
            avg += numbers[i];   
        }
        result = (double) avg/numbers.length;  
        return result;
        
        
    }
}