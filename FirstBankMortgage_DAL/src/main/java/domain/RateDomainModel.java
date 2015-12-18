package domain;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class RateDomainModel implements Serializable {
	
	private int RATEID;
	private int MINCREDITSCORE;
	private double INTERESTRATE;
	
	public RateDomainModel()
	{
		
	}
	
	public int getRATEID() {
		return RATEID;
	}
	public void setRATEID(int rateID) {
		RATEID = rateID;
	}
	public int getMINCREDITSCORE() {
		return MINCREDITSCORE;
	}
	public void setMINCREDITSCORE(int minCreditScore) {
		MINCREDITSCORE = minCreditScore;
	}
	public double getINTERESTRATE() {
		return INTERESTRATE;
	}
	public void setINTERESTRATE(double interestRate) {
		INTERESTRATE = interestRate;
	}
	
	
}