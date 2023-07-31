package project1;
import java.util.*;
public class testq5 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		String[] students= {"John", "Alice", "Zack", "Bella", "Edward"};
		sort(students);
	}
	public static void sort(String[] students) {
		for(int i=0;i<students.length-1;i++) {
			for(int j=i+1;j<students.length;j++) {
			if(students[i].compareTo(students[j])>0) {
				String temp=students[i];
				students[i]=students[j];
				students[j]=temp;
		}
		}
	}
	for(int k=0;k<students.length;k++)
		System.out.println(students[k]);
	}
}
