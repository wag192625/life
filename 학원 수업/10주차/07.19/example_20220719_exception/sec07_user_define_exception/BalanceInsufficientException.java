package sec07_user_define_exception;

public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() { }
	public BalanceInsufficientException(String message) {
		super(message);
	}
//	public BalanceInsufficientException(int money) {
//		System.out.println();
//	}
}

