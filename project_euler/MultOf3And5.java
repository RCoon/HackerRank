package project_euler;

import java.util.Scanner;

public class MultOf3And5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			long max = sc.nextLong();
			System.out.println(getSum(max));
		}
		sc.close();
	}
	
	private static long getSum(long maximum) {
		maximum--;
        
        long sum = 0;  
        long totalElements = 0;  
          
        if(maximum >= 3) {  
            totalElements = maximum / 3;  
            sum += (totalElements * ( 3 + totalElements*3)) / 2;  
        }  
          
        if(maximum >= 5) {  
            totalElements = maximum / 5;  
            sum += (totalElements * (5 + totalElements * 5)) / 2;  
        }  

        if(maximum >= 15) {  
            totalElements = maximum / 15;  
            sum -= (totalElements * (15 + totalElements * 15)) / 2;  
        }
		
		return sum;
	}
}