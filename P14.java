package arrays;
import java.util.*;
public class P14 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the size of an array :");
		int size=scan.nextInt();
		int[] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the "+(i+1)+" element :");
			a[i]=scan.nextInt();
		}
		int max=a[0];
		for (int i = 1; i < a.length; i++) {
			if (max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("The maximum value of the array is :"+max);
	}
}
