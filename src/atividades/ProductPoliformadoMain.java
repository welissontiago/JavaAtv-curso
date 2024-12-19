package atividades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Entites.ImportedProduct;
import Entites.ProductPolimorfado;
import Entites.UsedProduct;

public class ProductPoliformadoMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<ProductPolimorfado> list = new ArrayList<ProductPolimorfado>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 System.out.println("Quantos produtos gostaria de cadastrar?");
		 int x = sc.nextInt();
		 
		 for (int i=0; i<x; i++) {
			 System.out.println("Digite as informações do produto #"+i);
			 System.out.println("common, used or imported? c/u/i");
			 char ch = sc.next().charAt(0);
			 if(ch == 'c') {
				 System.out.println("Product name: ");
				 sc.nextLine();
				 String name = sc.nextLine();
				 System.out.println("Product price: ");
				 double price = sc.nextDouble();
				 ProductPolimorfado product = new ProductPolimorfado(name, price);
				 list.add(product);
			 }else if (ch == 'u') {
				 System.out.println("Product name: ");
				 sc.nextLine();
				 String name = sc.nextLine();
				 System.out.println("Product price: ");
				 double price = sc.nextDouble();
				 sc.nextLine();
				 System.out.println("Qual a data de fabricação do produto? ");
				 String manufacturedDateStr = sc.nextLine();
				    try {
				        Date manufacturedDate = sdf.parse(manufacturedDateStr);
				        ProductPolimorfado product = new UsedProduct(name, price, manufacturedDate);
				        list.add(product);
				    } catch (Exception e) {
				        System.out.println("Erro ao parsear a data: " + e.getMessage());
				    }
			 }else if(ch == 'i') {
				 System.out.println("Product name: ");
				 sc.nextLine();
				 String name = sc.nextLine();
				 System.out.println("Product price: ");
				 double price = sc.nextDouble();
				 System.out.println("Qual a taxa do produto? ");
				 double customsfee = sc.nextDouble();
				 ProductPolimorfado product = new ImportedProduct(name, price, customsfee);
				 list.add(product); 
			 }
			
		 }
		 
		 for (ProductPolimorfado produ: list) {
			 System.out.println(produ.priceTag());
		 }
		
		
		sc.close();

	}

}
