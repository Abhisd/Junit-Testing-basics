package Loan.Emi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLoanEmi {

	LoanEmiCalculator lc = new LoanEmiCalculator();

	@Test
	public void testForHousingLoan() {
		String loanType = "Home Loan";
		assertEquals(500.6252395713697, lc.calculateEMI(12000, loanType, 2), 0.0000000000001);
	}

	@Test
	public void testForVehicleLoan() {

		String loanType = "Vehicle Loan";
		assertEquals(500.57311797432794, lc.calculateEMI(12000, loanType, 2), 0.0000000000001);
	}

	@Test
	public void testForPersonalLoan() {
		String loanType = "Personal Loan";
		assertEquals(500.5209997030931, lc.calculateEMI(12000, loanType, 2), 0.0000000000001);
	}

}
