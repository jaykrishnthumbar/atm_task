package com.practice;

import java.util.Scanner;

public class User {
	private String user_name;
	private double account_no;
	private char gender;
	private double balance;
	Scanner scan = new Scanner(System.in);
	
	
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public double getAccount_no() {
		return account_no;
	}

	public void setAccount_no(double account_no) {
		this.account_no = account_no;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public void createAccount() {
		try {
			System.out.println("Enter User Name: ");
			 String user_name = scan.nextLine();
			 System.out.println("Enter User Gender(m / f): ");
			 char gender = scan.next().charAt(0);
			 if(!(gender=='m' || gender=='f'))
			 {
				 throw new Exception ();
			 }
			 this.setGender(gender);
			 System.out.println("Enter User Account_no: ");
			 double account_no = scan.nextDouble();
			 this.setAccount_no(account_no);
			 System.out.println("Enter Balance: ");
			 double balance = scan.nextDouble();
			 this.setBalance(balance);
			 this.setUser_name(user_name);
			 scan.nextLine();
			 
		}
		catch(Exception e){
			System.out.println("\nPlease enter valid data!!\n");
			scan.nextLine();
			Banking.main(null);
		}
		
		
	}

	public void depositMoney() {
		double money;
		try {
			System.out.println("Enter money you want to deposit: ");
			money=scan.nextDouble();
			balance=balance+money;
			System.out.println("New balance: "+balance);
		}
		catch(Exception e){
			System.out.println("\nPlease enter valid data!!\n");
			scan.nextLine();
			Banking.main(null);
		}
		
	}
	
	public void checkBalance() {
		System.out.println("balance: "+balance);
	}

	@Override
	public String toString() {
		return "\nUser : [user_name=" + user_name + ", account_no=" + account_no + ", gender=" + gender + ", balance="
				+ balance + " Rs.]\n";
	}

	public void withdrawMoney() {
		double money;
		try {
			System.out.println("Enter money you want to withdraw: ");
			money=scan.nextDouble();
			if(money<balance) {
				balance=balance-money;
				System.out.println("New balance: "+balance);
			}
			else {
				System.out.println("\nInsufficient money!!\n");
			}	
		}
		catch(Exception e){
			System.out.println("\nPlease enter valid data!!\n");
			scan.nextLine();
			Banking.main(null);
		}
		
	}
}
