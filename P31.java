package arrays;
import  java.util.*;
public class P31 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the size of an array :");
		int size=scan.nextInt();
		int[] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the "+(i+1)+" element :");
			a[i]=scan.nextInt();
		}
		System.out.print("Enter the size of an array :");
		int size1=scan.nextInt();
		int[] b=new int[size1];
		for (int i = 0; i < b.length; i++) {
			System.out.print("Enter the "+(i+1)+" element :");
			b[i]=scan.nextInt();
		}
		int m=a.length;
		int n=b.length;
		int o=m+n;
		int[] c=new int[o];
		for (int i = 0; i < a.length; i++) {
			c[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[m+i]=b[i];
		}
		System.out.print("[");
		for (int i : c) {
			System.out.print(i+",");
		}
		System.out.println("]");
	}
}
