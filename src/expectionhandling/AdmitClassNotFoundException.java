package expectionhandling;

public class AdmitClassNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorCode;
	private String errorMessage;
	public AdmitClassNotFoundException(String message) {
		
	super(message);
	
	}
	public AdmitClassNotFoundException(String errorCode, String errorMessage) {
		super(errorMessage);
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public AdmitClassNotFoundException(String errorCode, String errorMessage , Throwable e) {
		super(errorMessage , e);
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	
	
}
