package task1;

import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		while(true) {
			System.out.println("Enter 1 For Start the Game");
			System.out.println("Enter 2 For Exit the Game");
			int chooise=sc.nextInt();
			switch(chooise){
			case 1:
				Com();
				break;
			case 2:
			System.out.println("You have Success Fully Exit the game");
			return;
			
			default:
				System.out.println("Invalid choice. Please choose again.");
			
			}
			System.out.println();
			
		}
	}
	
	public static void Com() {
		Scanner sc=new Scanner (System.in);
		Random rm=new Random();
		int k=rm.nextInt(101);
		User(k);
	}
	
	public static void User(int k) {
		int number=k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number between 1 to 100");
		int user=sc.nextInt();
		if(user>100) {
			System.out.println("Please Enter number between 1 to 100");
		}
		if(user>=1 && user<=100) {
			Point(number,user);
		}
		
	}
	
	public static void Point(int number,int user ) {
		System.out.println("Computer Choose "+ number);
		System.out.println("You Choose "+ user);
		int result=number-user;
		if(result==0) {
			System.out.println("You have guess number is right");
		}
		else if(result<= 10 && result>=-10) {
			System.out.println("You are just to close too guessing the right number");
		}
		else {
			System.out.println("Guessing wrong number try again next time");
		}
	}
}

