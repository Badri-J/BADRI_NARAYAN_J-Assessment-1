package project1;
import java.util.*;
public class test1 {

	public static void main(String[] args) {
		for(int j=0;j<9;j++) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		if(n>=5 && n<=8)
		{
			for(int i=n;i>0;i--)
			{
			System.out.println("Distance to run: "+i);
			if(n-1==i)
			System.out.println("Good start, keep it up!");
			if(i<3){
				System.out.println("Almost there!");
			}
			}
			System.out.println("Done for the day!");
		}
		else
			System.out.println("Sorry, Choose between 5km to 8km");
	}
	}
}
