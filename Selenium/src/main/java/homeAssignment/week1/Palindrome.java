package homeAssignment.week1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				int input = 9089089; 
		        int num = input;
		        int output = 0;
		        int rem;
		     // For loop to Reverse the number 
		        for (int i = input; i != 0; i=i/10) 
		        {
		            rem = i % 10;
		            output = output * 10 + rem;
		        }
		  //If else loop to display the correct output//
		       if (num == output) 
		        {
		            System.out.println(num + " is a palindrome.");
		        } else {
		            System.out.println(num + " is not a palindrome.");
		        }

			}
			

	}

