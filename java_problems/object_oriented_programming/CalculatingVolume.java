package java_problems.object_oriented_programming;

import java.io.*;
import java.util.*;
import java.security.Permission;

/*
 * Problem Statement: 
 * You are given a class Solution and its main method in the editor. In each
 * test cases, it takes an input ch which represents a choice of the following:
 * 
 * ch=1 represents the volume of a cube that has to be calculated where a
 * represents the length of the sides of the cube.
 * 
 * ch=2 represents the volume of a cuboid that has to be calculated where l,b,h
 * represent the dimensions of a cuboid.
 * 
 * ch=3 represents the volume of a hemisphere that has to be calculated where r
 * represents the radius of a hemisphere.
 * 
 * ch=4 represents the volume of a cylinder that has to be calculated where r,h
 * represent the radius and height of the cylinder respectively.
 * Your task is to create the class Calculate and the required methods so that
 * the code prints the volume of the figures rounded to exactly 3 decimal
 * places.
 * 
 * In case any of the values are <= 0, print
 * "java.lang.NumberFormatException: All the values must be positive" without
 * quotes and terminate the program.
 * 
 * Note: Use Math.PI or 3.14159265 as the value of pi.
 * 
 * Input Format: 
 * First line contains T, the number of test cases. Each test case contains ch,
 * representing the choice as given in the problem statement.
 * 
 * When ch=1, Next line contains a, length of the sides of the cube.
 * 
 * When ch=2, Next three lines contain l, b, h representing length, breadth and
 * height of the cuboid respectively. l, b, h will be in three separate lines
 * 
 * When ch=3, Next line contains r, the radius of the hemisphere
 * 
 * When ch=4, Next two lines contain r, h representing the radius and height of
 * the cylinder respectively. r, h will be in two separate lines.
 * 
 * Note: You have to determine the data type of each parameter by looking at the
 * code given in the main method.
 * 
 * Constraints:
 * 1 <= ch <= 4
 * -100 <= a,l,b,h,r <= 100
 * There will be at most 3 digits after decimal point in input.
 * 
 * Output Format: 
 * For each test case, print the answer rounded up to exactly 3 decimal places
 * in a single line. For example, 1.2345 should be rounded to 1.235, 3.12995
 * should be rounded to 3.130.
 * 
 * Sample Input 1: 
 * 2
 * 1
 * 4
 * 4
 * 67.89
 * -98.54
 * 
 * Sample Output 1: 
 * 64.000
 * java.lang.NumberFormatException: All the values must be positive
 */
class Calculate {
    
    Scanner sc;
    Calculate output;
    
    public Calculate() {
        sc = new Scanner(System.in);
        output = this;
    }
    
    public int getINTVal() {
        
        return sc.nextInt();
    }
    
    public double getDoubleVal() {
        
        return sc.nextDouble();
    }
    
    static Calculate get_Vol() {
        
        return new Calculate();
    }
    
    public void display(double volume) throws IOException {
        
        System.out.printf("%.3f%n", volume);
    }
    
    private void checkForImproperInputs(double... nums) {
        
        for (double num : nums) {
            if (num <= 0) {
                throw new NumberFormatException("All the values must be positive");
            }
        }
    }
    
    public double main(int cubeSideLength) {
        
        checkForImproperInputs(cubeSideLength);        
        return cubeSideLength * cubeSideLength * cubeSideLength;
    }
    
    public double main(int length, int breadth, int height) {
        
        checkForImproperInputs(length, breadth, height);        
        return length * breadth * height;
    }
    
    public double main(double hemiRadius) {
        
        checkForImproperInputs(hemiRadius);       
        return Math.PI * (2.0/3) * hemiRadius * hemiRadius * hemiRadius;
    }
    
    public double main(double cylinderRadius, double cylinderHeight) {
        
        checkForImproperInputs(cylinderRadius, cylinderHeight);        
        return Math.PI * cylinderRadius * cylinderRadius * cylinderHeight;
    }
}

public class CalculatingVolume {

	public static void main(String[] args) {
		Do_Not_Terminate.forbidExit();		
		try{
			Calculate cal=new Calculate();
			int T=cal.getINTVal();
			while(T-->0){
			double volume = 0.0d;		
			int ch=cal.getINTVal();			
			if(ch==1){
			
				int a=cal.getINTVal();
				volume=Calculate.get_Vol().main(a);
				
				
			}
			else if(ch==2){
			
				int l=cal.getINTVal();
				int b=cal.getINTVal();
				int h=cal.getINTVal();
				volume=Calculate.get_Vol().main(l,b,h);
				
			}
			else if(ch==3){
			
				double r=cal.getDoubleVal();
				volume=Calculate.get_Vol().main(r);
				
			}
			else if(ch==4){
			
				double r=cal.getDoubleVal();
				double h=cal.getDoubleVal();
				volume=Calculate.get_Vol().main(r,h);
				
			}
			cal.output.display(volume);
			}
					
		}
		catch (NumberFormatException e) {
			System.out.print(e);
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}	
	}
}

/**
 *This class prevents the user from using System.exit(0)
 * from terminating the program abnormally.
 */
class Do_Not_Terminate {
	 
    public static class ExitTrappedException extends SecurityException {
    }
 
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}//end of Do_Not_Terminate	