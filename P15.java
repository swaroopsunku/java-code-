package arrays;
import java.util.*;
public class P15 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the size of an array :");
		int size=scan.nextInt();
		int[] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the "+(i+1)+" element :");
			a[i]=scan.nextInt();
		}
		int min=a[0];
		for (int i = 1; i < a.length; i++) {
			if (min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("The minimum value of the array is :"+min);
	}
}
