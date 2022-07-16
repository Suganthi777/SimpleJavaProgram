package org.javaprogram;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int n=153,rev=0,rem=0;
		int num=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev+(rem*rem*rem);
			n=n/10;
			
		}if(num==rev)
		{
			System.out.println("Armstrong Number");
		}
	}

}
