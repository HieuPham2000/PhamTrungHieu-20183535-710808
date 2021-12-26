package subsystem;

import common.exception.PaymentException;
import common.exception.UnrecognizedException;
import entity.payment.CreditCard;
import entity.payment.PaymentTransaction;

/**
 * The {@code InterbankInterface} class is used to communicate with the
 * {@link subsystem.InterbankSubsystem InterbankSubsystem} to make transaction
 * 
 * @author hieud
 * 
 */
public interface InterbankInterface extends InterbankPayOrderInterface, InterbankRefundInterface {

}
