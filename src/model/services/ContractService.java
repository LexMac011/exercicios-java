package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

		OnlinePaymentService onlinePaymentService;
		
		public ContractService(OnlinePaymentService onlinePaymentService) {
			this.onlinePaymentService = onlinePaymentService;
		}
		
		public void processContract(Contract contract, int months) {
			double parcela = contract.getTotalValue() / months;
			OnlinePaymentService service = new PaypalService();
			
			for (int i=1; i<=months; i++) {
				LocalDate proxMes = contract.getDate().plusMonths(i);
				double juros = service.interest(parcela, i);
				double resultado = service.paymentFee(parcela + juros);
				
				Installment fatura = new Installment(proxMes, parcela + juros + resultado);
				contract.addLista(fatura);
			}
		}
}
