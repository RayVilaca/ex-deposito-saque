package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char opcao = sc.next().charAt(0);
		
		Account cont;	
		double balance;
		
		if(opcao == 'y') {
			System.out.print("Enter initial deposit value: ");
			balance = sc.nextDouble();
			cont = new Account(number, holder, balance);
		} else {
			cont = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:" + cont);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		balance = sc.nextDouble();
		cont.deposit(balance);
		System.out.println("Updated account data:" + cont);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		balance = sc.nextDouble();
		cont.withdraw(balance);
		System.out.println("Updated account data:" + cont);
		
		sc.close();
	}

}
