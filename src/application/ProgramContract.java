package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class ProgramContract {

	public static void main(String[] args) throws ParseException {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Número: ");
		int numero = Integer.parseInt(sc.nextLine());
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate dataInicio = LocalDate.parse(sc.nextLine(), fmt);
		
		System.out.print("Valor do contrato: ");
		double valorContrato = Double.parseDouble(sc.nextLine());
		System.out.print("Entre com o número de parcelas: ");
		int parcelas = Integer.parseInt(sc.nextLine());
		
		Contract contrato = new Contract(numero, dataInicio, valorContrato);
		ContractService service = new ContractService(new PaypalService());
		service.processContract(contrato, parcelas);
		System.out.println("Parcelas:");
		
		for (Installment i : contrato.getInstallments()) {
			System.out.println(i.toString());
		}
		
		sc.close();
	}

}
