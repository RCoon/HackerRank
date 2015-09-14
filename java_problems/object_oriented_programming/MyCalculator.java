package java_problems.object_oriented_programming;

class MyCalculator implements AdvancedArithmetic {
    
    public int divisorSum(int n) {
        
        int sum = 0;
        
        if (n == 1) {
            return 1;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
        }
        sum += (1 + n);
        return sum;
    }
}

interface AdvancedArithmetic {
	
	public abstract int divisorSum(int n);
}