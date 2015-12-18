package base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.RateDomainModel;
import util.HibernateUtil;

public class RateDAL {
	private static int GivenScore;
	private static double Rate;

	public static ArrayList<RateDomainModel> getRates() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		ArrayList<RateDomainModel> Rules = new ArrayList<RateDomainModel>();

		try {
			tx = session.beginTransaction();

			List rules = session.createQuery("FROM RateDomainModel").list();
			for (Iterator iterator = rules.iterator(); iterator.hasNext();) {
				RateDomainModel rle = (RateDomainModel) iterator.next();
				Rules.add(rle);

			}

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return Rules;

	}
	
	public static double getRate(int GivenCreditScore) {
		ArrayList<RateDomainModel> li= getRates();
		for(RateDomainModel x: li){
			if (x.getMINCREDITSCORE()==GivenScore);
			Rate=x.getINTERESTRATE();
		}
		return Rate;
	}

}