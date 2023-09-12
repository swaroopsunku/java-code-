package arrays;
import java.util.*;
public class P26 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the size of an array :");
		int size=scan.nextInt();
		int[] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the "+(i+1)+" element :");
			a[i]=scan.nextInt();
		}
		System.out.print("Enter the which element need to replace :");
		int remove=scan.nextInt();
		System.out.print("Enter the new element need to replace :");
		int replace=scan.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i]==remove) {
				a[i]=replace;
			} 
		}
		for (int i : a) {
			System.out.println(i);
		}
	}
}
