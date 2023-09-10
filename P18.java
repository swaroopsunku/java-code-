package arrays;
import java.util.*;
public class P18 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the size of an array :");
		int size=scan.nextInt();
		int[] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the "+(i+1)+" element :");
			a[i]=scan.nextInt();
		}
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 1; j < a.length-i; j++) {
				if (a[j-1]<a[j]) {
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print('[');
		for (int i : a) {
			System.out.print(i+",");
		}
		System.out.println(']');
	}
}
