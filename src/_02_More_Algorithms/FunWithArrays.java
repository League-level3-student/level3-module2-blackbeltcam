package _02_More_Algorithms;

public class FunWithArrays {
	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {4,5,6};
		printArray(a);
		printArray(b);
		a=b;
		printArray(a);
		printArray(b);
		a[1]=9;
		printArray(a);
		printArray(b);
		
		}
	public static void printArray(int[] x) {
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i]);
		}
		System.out.println();
		
	}

}
