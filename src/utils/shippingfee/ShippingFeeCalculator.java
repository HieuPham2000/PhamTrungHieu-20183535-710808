package utils.shippingfee;

import entity.order.Order;

/**
 * Interface tính tiền ship
 * 
 * @author PTHIEU 21.12.2021
 */
public interface ShippingFeeCalculator {
	public int calculateShippingFee(Order order);
}
