package model.entities;

public class OutsourcedEmployee extends Employee {
	
	private Double additionalCharge;
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	@Override
	public double payment() {
		return getHours() * getValuePerHour() + (additionalCharge * 1.1);
	}
	// OU VC PODE FAZER super.payment() PRA PEGAR DA CLASSE PAI E SÓ COLOCAR O RESTANTE DA CONTA, MAIS PRÁTICO
}
