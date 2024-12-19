package atividades;

import java.util.ArrayList;
import java.util.Scanner;

import Entites.Employee;
import Entites.OutsourceEmployee;

public class EmployeeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> Employee = new ArrayList<Employee>();

		System.out.println("Quantos funcionarios gostaria de cadastrar?: ");
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			System.out.println("Digite as informações do #" + (i+1) + " funcionario!");
			System.out.println("Ele é tercerizado?: y/n");
			String tercerizado = sc.next();
			if (tercerizado.equalsIgnoreCase("n")) {
				System.out.println("Qual o nome do funcionario? ");
				String name = sc.next();
				System.out.println("Quantas Horas trabalhadas?: ");
				int hours = sc.nextInt();
				System.out.println("Qual o valor por hora?: ");
				double valuePerHour = sc.nextDouble();
				Employee employee = new Employee(name, hours, valuePerHour);
				Employee.add(employee);
			} else if (tercerizado.equalsIgnoreCase("y")) {
				System.out.println("Qual o nome do funcionario? ");
				String name = sc.next();
				System.out.println("Quantas Horas trabalhadas?: ");
				int hours = sc.nextInt();
				System.out.println("Qual o valor por hora?: ");
				double valuePerHour = sc.nextDouble();
				System.out.println("Qual o valor adicional? ");
				double additionalCharge = sc.nextDouble();
				Employee employee2 = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
				Employee.add(employee2);
			}

			for (Employee trabalhador : Employee) {
				System.out.println("Payments: " + trabalhador);
			}
		}
		sc.close();

	}
}
