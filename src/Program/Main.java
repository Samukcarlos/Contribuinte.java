package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.TaxPayer;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		Double educationSpending;
		Double salaryIncome;
		Double servicesIncome;		
		Double healthSpending;
		Double capitalIncome;
		int N;
		TaxPayer taxPayer = new TaxPayer(); 
			
		System.out.print("Quantos contribuintes você vai digitar? ");
		N = sc.nextInt();
	 
		for (int i = 0; i < N; i++) {
			int acc = i + 1;
			
			System.out.println("Digite os dados do " +acc+"° contribuinte ");
			System.out.print("Renda anual com salário: ");
			salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			servicesIncome = sc.nextDouble();
			sc.nextLine();
			System.out.print("Renda anual com ganho de capital: ");
			capitalIncome = sc.nextDouble();
			System.out.print("Gastos médicos anuais: ");
			healthSpending = sc.nextDouble();
			sc.nextLine();
			System.out.print("Gastos educacionais anuais: ");
			educationSpending = sc.nextDouble();
			System.out.println();
			
			TaxPayer tax = new TaxPayer(salaryIncome, servicesIncome,capitalIncome, healthSpending, educationSpending);
			list.add(tax);
			
			if (i+1 == N) {
				for ( i = 0; i < N; i++) {
	
			System.out.println();
			System.out.println("Resumo do "+(i+1)+"° contribuinte ");
			System.out.println("Imposto bruto total: "+ list.get(i).grossTax());
			System.out.println("Abatimento: "+ list.get(i).taxRebate());
			System.out.println("Imposto devido: "+ list.get(i).netTax());
				}
			}
			
	}
		

}
}