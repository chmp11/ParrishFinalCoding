package ch.makery.address.model;

import org.apache.poi.ss.formula.functions.FinanceLib;

import base.RateDAL;
import domain.RateDomainModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Rate extends RateDomainModel {
	@FXML
	public Label txtHouseCost;
	@FXML
	public Label txtIncome;
	@FXML 
	public Label txtExpenses;
	@FXML 
	public Label txtCreditScore;
	@FXML
	public Label lblMortgagePayment;
	
	public double getPayment(int NumberOfPayments){
		int score = getMINCREDITSCORE();
		double r = RateDAL.getRate(score);
		//PV and PMT require monthly rates
		double rate = (r/12);
		boolean type = false;
		String Housecost = txtHouseCost.getText();
		double HouseCost = Integer.parseInt(Housecost);
		String eXpenses = txtExpenses.getText();
		double Expenses = Integer.parseInt(eXpenses);
		String iNcome = txtIncome.getText();
		double Income = Integer.parseInt(iNcome);
		double PMT;
		PMT=FinanceLib.pmt(rate,NumberOfPayments,0,HouseCost,type);
		double check1 = (Income*.36);
		double check2 = ((Income+Expenses)*.28);
		if ((PMT<=check1) && (PMT <= check2)){
			return PMT;
		}
		else{
			lblMortgagePayment.setText("House Cost is Too High");
			lblMortgagePayment.setVisible(true);
			PMT=0;
		}
		return PMT;
	}
}
