package main;

public class SumOfDigits {
    
    public int sumOfDigits(int n) {
        int sum = 0;
        
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        
        if (sum > 9) {
            return sumOfDigits(sum);
        }
        
        return sum;
    }
}
