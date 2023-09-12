package arrays;
import java.util.*;
public class P24 {
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
		for (int i = 0; i < a.length/2; i++) {
				count++;
		}
		int index=0;
		int[] b=new int[count];
		for (int i = 0; i < a.length/2; i++) {
				b[index]=a[i];
				index++;
		}
		for (int i = 0; i < b.length-1; i++) {
			for (int j = 1; j < b.length-i; j++) {
				if (b[j-1]<b[j]) {
					int temp=b[j-1];
					b[j-1]=b[j];
					b[j]=temp;
				}
			}
		}
		System.out.println("The maximum element from the first half of array is :"+b[0] );
	}
}
