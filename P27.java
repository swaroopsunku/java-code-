package arrays;
import java.util.*;
public class P27 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the size of an array :");
		int size=scan.nextInt();
		int[] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the "+(i+1)+" element :");
			a[i]=scan.nextInt();
		}
		System.out.print("Enter the element need to know the occurance :");
		int ele=scan.nextInt();
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==ele) {
				count++;
			}
		}
		System.out.println("The "+ele+" is occurred in array is :"+count);
	}
}
