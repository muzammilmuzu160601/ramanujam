package userinputarrayelements;

import java.util.Scanner;

public class UserInputArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		    int sum = 0;
		    System.out.println("Enter the Elements:");
		    for(int i=0; i<=10; i++)
		    {
		    	array[i] = scanner.nextInt();
		    }
		    for(int num : array) 
		    {
		    	sum = sum+num; 
		    	}
		    System.out.println("Sum of array elements is:" +sum);
		    
	}

}
