package application;

import java.util.Locale;
import java.util.Scanner;



import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		String holder =  sc.nextLine();
		sc.nextLine();
		System.out.print("Balance: ");
		double balance = sc.nextDouble();
		System.err.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		if (amount > acc.getWithdrawLimit()) {
			System.out.println("Withdraw Error: The amount excees withdraw limit");
			
		}else if (amount > acc.getBalance()) {
			
			System.out.println("Withdraw Error: not enough balance");
		}else {
			acc.withdraw(amount);
			System.out.printf("Novo saldo: %.2f%n" , acc.getBalance());
			
		}
		
		
		sc.close();

	}

}
