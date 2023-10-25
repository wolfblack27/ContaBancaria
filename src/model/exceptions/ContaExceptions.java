package model.exceptions;

import javax.management.RuntimeErrorException;

public class ContaExceptions  extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ContaExceptions(String msg) {
		super(msg);
	}

}
