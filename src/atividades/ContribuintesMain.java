package atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entites.Contribuintes;
import Entites.Individual;
import Entites.LegalEntity;

public class ContribuintesMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Contribuintes> list = new ArrayList<>();
		
		
		System.out.println("Enter the number of tax payers:");
		int payers = sc.nextInt();
		
		for(int i=0; i<payers; i++) {
			System.out.println("Tax payer #" + i +   " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			
			if(ch == 'i') {
				System.out.println("Name:");
				String name = sc.next();
				System.out.println("Anual income:");
				double annualIncome = sc.nextDouble();
				System.out.println("Health expenditures:");
				double healthcare = sc.nextDouble();
				list.add(new Individual(name, annualIncome, healthcare));
			}else if(ch == 'c') {
				System.out.println("Name:");
				String name = sc.next();
				System.out.println("Anual income:");
				double annualIncome = sc.nextDouble();
				System.out.println("Number of employees:");
				int employeers = sc.nextInt();
				list.add(new LegalEntity(name, annualIncome, employeers));
			}
		}
		
		System.out.println("TAXES PAID:");
		for (Contribuintes contribuintes: list) {
			System.out.println(contribuintes.getName()+":"+" $" + (String.format("%.2f", contribuintes.impostos())));
		}
		
		double tax = 0;
		for (Contribuintes Contribuintes: list) {
			tax += Contribuintes.impostos();
		}
		
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", tax));
		
		sc.close();

	}

}
