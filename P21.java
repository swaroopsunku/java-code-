package arrays;
import java.util.*;
public class P21 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the size of an array :");
		int size=scan.nextInt();
		int[] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the "+(i+1)+" element :");
			a[i]=scan.nextInt();
		}
		System.out.print("Enter the element which is need to check :");
		int c=scan.nextInt();
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==c) {
				count++;
			}
		}
		if (count>0) {
			System.out.println("The element "+c+" is present in the array");
		}
		else {
			System.out.println("The element is "+c+" not present in the array");
		}
	}
}
