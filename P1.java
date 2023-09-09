package arrays;
import java.util.*;
public class P1 {
static Scanner scan=new Scanner(System.in);
public static void main(String[] args) {
	int[] a=new int[5];
	for (int i = 0; i < a.length; i++) {
		System.out.print("Enter the "+(i+1)+" element :");
		a[i]=scan.nextInt();
	}
	System.out.print('[');
	for (int i = 0; i < a.length; i++) {
		if (i<a.length-1) {
			System.out.print(a[i]+",");
		} else {
			System.out.print(a[i]);
		}
	}
	System.out.println(']');
}
}
