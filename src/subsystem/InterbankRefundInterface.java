package subsystem;

import common.exception.PaymentException;
import common.exception.UnrecognizedException;
import entity.payment.CreditCard;
import entity.payment.PaymentTransaction;

/**
 * Interface quy định phương thức refund của interbank
 * 
 * @author PTHIEU 26.12.2021
 */
public interface InterbankRefundInterface {
	public abstract PaymentTransaction refund(CreditCard card, int amount, String contents)
			throws PaymentException, UnrecognizedException;
}
