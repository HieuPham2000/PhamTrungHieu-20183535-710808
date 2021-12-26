package utils.shippingfee.impl;

import java.util.Random;

import entity.order.Order;
import utils.shippingfee.ShippingFeeCalculator;

public class ShippingFeeCalculateByWeight implements ShippingFeeCalculator {
	
	private final int LENGTH = 40;
    private final int WIDTH = 60;
    private final int HEIGHT = 60;

	@Override
	public int calculateShippingFee(Order order) {
		Random rand = new Random();
		double alternativeWeight = LENGTH * WIDTH * HEIGHT / 6000;
        return (int)( ( (rand.nextFloat()*10)/100 ) * order.getAmount() + alternativeWeight);
	}

}
