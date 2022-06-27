package com.learn;

import java.util.ArrayList;
import java.util.List;

public class Recursion {

	public static void main(String[] args) {
		
//      System.out.println(sumOfNnaturalNumbers(3));
//      System.out.println(power(3,4));
//      System.out.println(fastPower(3,4));
//      System.out.println(allWaysInNXM(3,4));
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(3);
		
//		System.out.println(joseph(list, 6, 5, 5));
		
//		System.out.println(joseph1(5, 3));
		String s = "abc";
		
//		System.out.println(palindromeString(s, 0, s.length()-1));
		
		powerSet(s, 0, "");

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
	
	public static int joseph(ArrayList<Integer> list,int n,int k,int player) {
		
		if(list.size()==1) return list.get(0);
		
		int index = list.indexOf(player) + (k-1) + 1;	// k-1 as starting from same player. +1 as we have to go to player next to dead	
		int newPlayer = list.get(index < list.size() ? index : (index - list.size()));   // If index > size, check from starting
		
		
		list.remove(list.get(index - 1 < list.size() ? index - 1 : (index - 1 - list.size())));
		
		return joseph(list, n-1, k, newPlayer);
	}
	

	public static int joseph1(int n,int k) {
		
		return  (joseph1(n-1, k)+k)%n;
	}
	
	
	public static boolean palindromeString(String s, int left, int right) {
		
		if(right <= left) return true;
		
		if(s.charAt(left)==s.charAt(right)) return palindromeString(s, left+1, right-1);
		
		return false;
	}
	
	
	public static void powerSet(String s, int i, String arr) {
		
		if(i == s.length()) { 
			System.out.println(arr);
			return;
		}
		
		powerSet(s,i+1,arr + s.charAt(i));
		powerSet(s,i+1,arr);
	}
	
	
	
	
	
	
}
