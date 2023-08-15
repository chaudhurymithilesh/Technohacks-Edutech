package task1;

import java.util.*;
import java.util.ArrayList;

public class Calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.println("1- For Sum");
			System.out.println("2- For Subtraction");
			System.out.println("3- For Multiplication");
			System.out.println("4- For Division");
			System.out.println("5- For Exit");
			System.out.println("Choose 1/2/3/4/5 Option");
			int n=sc.nextInt();
			
			switch(n) {
			case 1:
				Sum();
//				System.out.println(s);
				break;
				
			case 2:
				 Minus();
//				System.out.println(m);
				break;
			case 3:
				Multi();
//				System.out.println(Mul);
				break;
			case 4:
				Divi();
//				System.out.println(Divi);
				break;
			case 5:
				System.out.println("Exit Program SuccessFully");
				return;
				
			default:
                System.out.println("Invalid choice. Please choose again.");
				
			}
			
		}
		
	}
	
	public static void Sum() {
		ArrayList<Float> arr1= new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many number do you want to  Sum");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter "+i+" Number");
			float f=sc.nextFloat();
			arr1.add(f); 
		}
			float sum=0;
			for( float arr2:arr1) {
				sum+=arr2;
			}
			for(int i=0;i<arr1.size();i++) {
				String v="+";
				if(i>=arr1.size()-1) {
					v="";
				}
			System.out.print(arr1.get(i) + v);
			}
			System.out.println(" = "+sum);
		}
	
	public static void Minus() {
		ArrayList<Float> arr1= new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many number do you want to Subtraction");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter "+i+" Number");
				float f=sc.nextFloat();
				
				int intvalue = (int) f;
				arr1.add(f); 
			}
			
			float minus=arr1.get(0);
			
			for(int j=0;j<n-1;j++) {
				float temp = minus-arr1.get(j+1);
				minus=temp;
				
			}
			for(int i=0;i<n;i++) {
				String v="-";
				if(i>=n-1) {
					v="";
				}
			System.out.print(arr1.get(i) + v);
			}
			System.out.println(" = "+minus);
	}
	public static void Multi() {
		ArrayList<Float> arr1= new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many number do you want to Multiplication");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter "+i+" Number");
				Float f=sc.nextFloat();
				arr1.add(f); 
			}
			
			Float minus=arr1.get(0);
			
			for(int j=0;j<n-1;j++) {
				Float temp = minus*arr1.get(j+1);
				minus=temp;
				
			}
			for(int i=0;i<n;i++) {
				String v="*";
				if(i>=n-1) {
					v="";
				}
			System.out.print(arr1.get(i) + v);
			}
			System.out.println(" = "+minus);
	}
	public static void Divi() {
		ArrayList<Float> arr1= new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many number do you want to Division");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter "+i+" Number");
				Float f=sc.nextFloat();
				arr1.add(f); 
			}
			
			Float minus=arr1.get(0);
			
			for(int j=0;j<n-1;j++) {
				Float temp = minus/arr1.get(j+1);
				minus=temp;
				
			}
			for(int i=0;i<n;i++) {
				String v="/";
				if(i>=n-1) {
					v="";
				}
			System.out.print(arr1.get(i) + v);
			}
			System.out.println(" = "+minus);
	}
	
	
	}


