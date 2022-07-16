package org.javaprogram;

public class SumAndProductOfDigit {
	
	public static void main(String[] args) {
		
		int n =12345,rem=0,rev=0,rem1=1,rev1=1,n1=1234;
		
		while(n>0) {
		
		rem=n%10;
		rev=rev+rem;
		n=n/10;
		}
		
		while(n>0)
		{
			rem1=n1%10;
			rev1=rev1*rem1;
			n1=n1/10;
		}
		System.out.println("Add\n"+ rev);
		System.out.println("Mul\n"+ rev1);
		
	}}


