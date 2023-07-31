package project1;
import java.util.*;
public class testqu2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=input.nextInt();
		int sum=0;
		int max=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			if(sum<0) 
				sum=0;
			else {
				sum+=arr[i];
				max=sum;
				if(max>sum) {
				max=sum;
				}
			}
		}
		System.out.println(max-1);
	}
}
