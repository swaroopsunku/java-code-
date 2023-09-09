package arrays;
import java.util.*;
public class P10 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the size of an array :");
		int size=scan.nextInt();
		int[] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the "+(i+1)+" element :");
			a[i]=scan.nextInt();
		}
		int sum=0,count=0;
		for(int j=0;j<a.length;j++) {
			if (j%2==0) {
				sum+=a[j];
				count++;
			}
		}
		int avg=sum/count;
		System.out.println(avg);
	}
}
