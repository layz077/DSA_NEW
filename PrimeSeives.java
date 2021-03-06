package com.learn;

import java.util.Arrays;

public class PrimeSeives{
	public static void main(String[] args) {
	   	int n = 20;
	   	boolean[] result = new boolean[n+1];
	   	
	   	Arrays.fill(result, true);
	   	result[0]=false;                              // Root of 20 -> 4.5....
	   	result[1]=false;
	   	
	   	for(int i=2;i*i<=n;i++) {
	   		
	   		for(int j=2*i;j<=n;j+=i) {
	   			
	   		   result[j] = false;
	   		}
	   		
	   	}
	   	
	   	for(boolean b:result) System.out.println(b);
	   	
	   	// Trailing zeroes in a factorial.
	   	
	   	int x = 50;
	   	int res = 0;
	   	int y = 5;
	   	
	   	while(y<x) {
	   	    res = res + x/y;
	   	    y *= 5;
	   	}
	   	
	   	System.out.println(res);
	   	
	}
}