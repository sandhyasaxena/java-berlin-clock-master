package com.ubs.opsit.interviews.exception;

/**
 * @author sandhya.saxena
 * User defined Exception class
 *
 */
public class InvalidInputException extends Exception{

	private static final long serialVersionUID = -1074206328494188929L;
	private String exceptionDesc;

	public InvalidInputException()
	{
		super();
	}

	public InvalidInputException(Throwable pThrowableObj)
	{
		super(pThrowableObj);
	}

	public InvalidInputException(String pExceptionDesc)
	{
		super(pExceptionDesc);
		exceptionDesc=pExceptionDesc;
	}

	@Override
	public String toString()
	{
		String lExceptionMsg=null;
		String lClassName=getClass().getName();

		if(exceptionDesc==null)
			lExceptionMsg=lClassName;
		else
			lExceptionMsg=lClassName+":"+exceptionDesc;
		return lExceptionMsg;
	}

}
