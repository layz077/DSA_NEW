package com.learn;

public class Recursion {

	public static void main(String[] args) {
		
      System.out.println(sumOfNnaturalNumbers(3));
      System.out.println(power(3,4));
      System.out.println(fastPower(3,4));
      System.out.println(allWaysInNXM(3,4));

	}
	
	public static int sumOfNnaturalNumbers(int n) {
				
		if(n==1) {
		    return 1;	
		}
		return sumOfNnaturalNumbers(n-1)+n;
	}
	
	public static int power(int a,int b) {
		
		if(a==1) return 1;
		if(b==1) return a;
		
		return power(a,b-1)*a;
	}
	
	public static long fastPower(int a,int b) {
		
		int result = 1;
		
		while(b > 0) {
			
			if((b&1) != 0) {
				result = result * a;
			}
			
			a = a * a;
			b = b >> 1;
			
		}
		return result;
	}
	
	public static int allWaysInNXM(int n, int m) {
		
		if(n==1 || m==1) return 1;
		
		return allWaysInNXM(n-1, m) + allWaysInNXM(n, m-1);
	}
	

}
