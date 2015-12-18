package UnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import ch.makery.address.model.Rate;
import domain.RateDomainModel;

public class Payment_Test {

	@Test
	public void PMTtest() {
		int NumberOfPayments= 360;
		Rate r = new Rate();
		RateDomainModel Mortgage= new RateDomainModel();
		Mortgage.setMINCREDITSCORE(700);
		double total = r.getPayment(NumberOfPayments);
		assertTrue(total==1432.25);
	}

}
