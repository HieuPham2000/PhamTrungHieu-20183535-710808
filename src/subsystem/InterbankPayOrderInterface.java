package subsystem;

import common.exception.PaymentException;
import common.exception.UnrecognizedException;
import entity.payment.CreditCard;
import entity.payment.PaymentTransaction;

/**
 * Interface quy định phương thức payOrder của interbank
 * 
 * @author PTHIEU 26.12.2021
 */
public interface InterbankPayOrderInterface {
	public PaymentTransaction payOrder(CreditCard card, int amount, String contents)
			throws PaymentException, UnrecognizedException;
}
