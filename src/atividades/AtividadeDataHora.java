package atividades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entites.Departament;
import Entites.HourContract;
import Entites.worker;
import Entites.enums.WorkerLevel;


public class AtividadeDataHora {

	public static void main(String[] args) throws ParseException{
		

		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat stf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Digite o nome do departamento: ");
		String department = sc.nextLine();
		System.out.print("Digite os dados do trabalhor! ");
		System.out.print("Qual seu nome?: ");
		String name = sc.nextLine();
		System.out.print("Qual seu nivel?: ");
		String level = sc.nextLine();
		System.out.print("Qual seu salario base ?: ");
		double salary = sc.nextDouble();
		
		worker Worker = new worker(name, WorkerLevel.valueOf(level), salary, new Departament(department));
		
		System.out.println("Quantos contratos esse trabalho irá ter ?: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Qual a data do contrato " + (i+1)  + " ?");
			System.out.print("Digite a data no formato (DD/MM/YYY):");
			Date contractDate = stf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valor = sc.nextDouble();
			System.out.print("Duração do contrato (Horas): ");
			int horas = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valor, horas);
			Worker.addContract(contract);
		}
		
		System.out.println();
		
		System.out.print("Digite o mês e o ano que gostaria de calcular o salario (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int Year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Nome: " + Worker.getName());
		System.out.println("Department: " + Worker.getDepartament().getDepartament());
		System.out.println("Ganhos " + monthAndYear + " :" + String.format("%.2f", Worker.income(Year, month)));
		
		sc.close();
	}
	

}
