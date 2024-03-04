package application;

import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Activ1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		Worker worker = new Worker("Matheus Erick Barros Costa Dias da Silva", WorkerLevel.valueOf("SENIOR"), 3865.12,
				new Department("Engenharia de Computação e Automação"));

		worker.AddContract(new HourContract(Date.from(Instant.now()), 80D, 4));
		worker.AddContract(new HourContract(Date.from(Instant.now()), 90D, 5));
		worker.AddContract(new HourContract(Date.from(Instant.now()), 100D, 6));
		
		int year = 2024;
		int month = 3;
		
		System.out.println("Name: " + worker.getName() + "\nDepartament: " + worker.getDepartment().getName() + "\nIncome for " + month + "/" + year + ": " + "R$" + worker.income(year, month));

		scan.close();
	}

}
