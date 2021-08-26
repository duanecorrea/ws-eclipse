package model.services;

import java.util.Calendar;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		
		for(int i = 1; i <= months; i++) {
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(contract.getDate());
			cal.add(Calendar.MONTH, i);					
			
			contract.addInstallment(new Installment(cal.getTime(),onlinePaymentService.interest(contract.getTotalValue() / contract.getNumber(), i)));			
		}
	}

}
