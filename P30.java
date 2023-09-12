package arrays;
import java.util.*;
public class P30 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the size of an array :");
		int size=scan.nextInt();
		int[] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the "+(i+1)+" element :");
			a[i]=scan.nextInt();
		}
		int count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i]==a[j]&&i>j) {
					break;
				}
				if (a[i]==a[j]) {
					count++;
					break;
				}
			}
		}
		int[]b=new int[count];
		int index=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i]==a[j]&&i>j) {
					break;
				}
				if (a[i]==a[j]) {
					b[index++]=a[i];
					break;
				}
			}
		}
		System.out.print('[');
		for (int i : b) {
			System.out.print(i+",");
		}
		System.out.println(']');
	}
}
