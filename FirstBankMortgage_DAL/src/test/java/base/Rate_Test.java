package base;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.RateDomainModel;

public class Rate_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Lengthtest() {
		ArrayList<RateDomainModel> li= RateDAL.getRates();
		System.out.print(li.size());
		assertTrue(li.size()>0);
	}
	
	@Test
	public void Scoretest(){
		int GivenCreditScore = 650;
		double answer=RateDAL.getRate(GivenCreditScore);
		System.out.print(answer);
		assertTrue(answer==4.5);
	}

}
