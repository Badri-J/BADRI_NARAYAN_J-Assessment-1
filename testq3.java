package project1;
import java.util.*;
public class testq3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=input.nextInt();
		int sum=0;
		boolean flag=false;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
			if(sum%2==0)
				flag=true;
			else
				flag=false;
		}
		System.out.println((flag)?"True":"False");
	}
}
