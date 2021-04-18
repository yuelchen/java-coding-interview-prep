package com.yuelchen.billing;

import org.junit.Assert;
import org.junit.Test;

public class SaleTest {
	
	@Test
	public void getDiscountAmountWholeNumber() {
		Assert.assertEquals(1, Sale.getDiscountAmount(10, 10), 0);
	}
	
	@Test
	public void getDiscountAmountDecimal1() {
		Assert.assertEquals(2.02, Sale.getDiscountAmount(20.20, 10), 0);
	}
	
	@Test
	public void getDiscountAmountDecimal2() {
		Assert.assertEquals(2.87, Sale.getDiscountAmount(19.15, 15), 0);
	}

	@Test
	public void getSalePriceAfterDiscountWholeNumber() {
		Assert.assertEquals(9, Sale.getSalePriceAfterDiscount(10, 10), 0);
	}

	@Test
	public void getSalePriceAfterDiscountDecimal1() {
		Assert.assertEquals(18.18, Sale.getSalePriceAfterDiscount(20.20, 10), 0);
	}

	@Test
	public void getSalePriceAfterDiscountDecimal2() {
		Assert.assertEquals(16.28, Sale.getSalePriceAfterDiscount(19.15, 15), 0);
	}
	
	@Test
	public void getDiscountRateWholeNumber() {
		Assert.assertEquals(10, Sale.getDiscountRate(10, 9), 2);
	}
	
	@Test
	public void getDiscountRateDecimal1() {
		Assert.assertEquals(10, Sale.getDiscountRate(20.20, 18.18));
	}
	
	@Test
	public void getDiscountRateDecimal2() {
		Assert.assertEquals(15, Sale.getDiscountRate(19.15, 16.28), 2);
	}
	
	@Test
	public void getCommissionAmountWholeNumber() {
		Assert.assertEquals(10, Sale.getCommissionAmount(1000, 1), 0);
	}
	
	@Test
	public void getCommissionAmountDecimal1() {
		Assert.assertEquals(212.65, Sale.getCommissionAmount(4253, 5), 2);
	}

	@Test
	public void getCommissionAmountDecimal2() {
		Assert.assertEquals(458.80, Sale.getCommissionAmount(9175.99, 5), 2);
	}

	@Test
	public void getRevenueAfterCommissionWholeNumber() {
		Assert.assertEquals(990, Sale.getRevenueAfterCommission(1000, 1), 0);
	}

	@Test
	public void getRevenueAfterCommissionDecimal1() {
		Assert.assertEquals(4040.35, Sale.getRevenueAfterCommission(4253, 5), 2);
	}

	@Test
	public void getRevenueAfterCommissionDecimal2() {
		Assert.assertEquals(8717.19, Sale.getRevenueAfterCommission(9175.99, 5), 2);
	}
	
	@Test
	public void getCommissionRateWholeNumber() {
		Assert.assertEquals(1, Sale.getCommissionRate(1000, 990));
	}
	
	@Test
	public void getCommissionRateDecimal1() {
		Assert.assertEquals(5, Sale.getCommissionRate(4253, 4040.355));
	}
	
	@Test
	public void getCommissionRateDecimal2() {
		Assert.assertEquals(5, Sale.getCommissionRate(9175.99, 8717.19));
	}
	
	@Test
	public void getTipAmountWholeNumber() {
		Assert.assertEquals(20, Sale.getTipAmount(100, 20), 0);
	}

	@Test
	public void getTipAmountDecimal1() {
		Assert.assertEquals(3.78, Sale.getTipAmount(25.18, 15), 2);
	}

	@Test
	public void getTipAmountDecimal2() {
		Assert.assertEquals(13.68, Sale.getTipAmount(75.99, 18), 2);
	}
	
	@Test
	public void getTotalAfterTipWholeNumber() {
		Assert.assertEquals(120, Sale.getTotalAfterTip(100, 20), 0);
	}
	
	@Test
	public void getTotalAfterTipDecimal1() {
		Assert.assertEquals(28.96, Sale.getTotalAfterTip(25.18, 15), 2);
	}

	@Test
	public void getTotalAfterTipDecimal2() {
		Assert.assertEquals(89.67, Sale.getTotalAfterTip(75.99, 18), 2);
	}

	@Test
	public void getTipRateWholeNumber() {
		Assert.assertEquals(20, Sale.getTipRate(100, 120));
	}

	@Test
	public void getTipRateDecimal1() {
		Assert.assertEquals(15, Sale.getTipRate(25.18, 28.96));
	}

	@Test
	public void getTipRateDecimal2() {
		Assert.assertEquals(18, Sale.getTipRate(75.99, 89.67));
	}
	
	@Test
	public void getSplitAfterTipWholeNumberLessThanZero() {
		Assert.assertEquals(120, Sale.getSplitAfterTip(100, 20, -2), 0);
	}
	
	@Test
	public void getSplitAfterTipWholeNumberZero() {
		Assert.assertEquals(120, Sale.getSplitAfterTip(100, 20, 0), 0);
	}
	
	@Test
	public void getSplitAfterTipWholeNumberGreaterThanZero() {
		Assert.assertEquals(40, Sale.getSplitAfterTip(100, 20, 3), 0);
	}

	@Test
	public void getSplitAfterTipDecimal1LessThanZero() {
		Assert.assertEquals(28.96, Sale.getSplitAfterTip(25.18, 15, -2), 2);
	}

	@Test
	public void getSplitAfterTipDecimal1Zero() {
		Assert.assertEquals(28.96, Sale.getSplitAfterTip(25.18, 15, 0), 2);
	}

	@Test
	public void getSplitAfterTipDecimal1GreaterThanZero() {
		Assert.assertEquals(7.24, Sale.getSplitAfterTip(25.18, 15, 4), 2);
	}

	@Test
	public void getSplitAfterTipDecimal2LessThanZero() {
		Assert.assertEquals(89.67, Sale.getSplitAfterTip(75.99, 18, -2), 2);
	}

	@Test
	public void getSplitAfterTipDecimal2Zero() {
		Assert.assertEquals(89.67, Sale.getSplitAfterTip(75.99, 18, 0), 2);
	}

	@Test
	public void getSplitAfterTipDecimal2GreaterThanZero() {
		Assert.assertEquals(17.93, Sale.getSplitAfterTip(75.99, 18, 5), 2);
	}
}
