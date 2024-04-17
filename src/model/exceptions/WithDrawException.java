package model.exceptions;

public class WithDrawException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public WithDrawException(String msg) {
		super(msg);
	}
}
