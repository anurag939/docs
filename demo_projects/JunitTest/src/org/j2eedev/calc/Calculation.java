package org.j2eedev.calc;
public class Calculation {
	public static void main(String args[]){
		System.out.println("1+2="+add(1,2));
		System.out.println("2-1="+sub(2,1));
	}
	public static int add(int a, int b) {
			return a + b;
		}
		public static int sub(int a, int b) {
			return a - b;
		}
	}
